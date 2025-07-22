package edu.pict.JudgeGrpcWrapper.service;

import com.example.judge.*;
import com.google.protobuf.BoolValue;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.grpc.server.service.GrpcService;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Iterator;

@GrpcService
public class LanguageServiceGrpcImpl extends LanguageServiceGrpc.LanguageServiceImplBase {

    @Autowired
    private WebClient webClient;

    private final ObjectMapper objectMapper = new ObjectMapper();

    private Mono<LanguageList> fetchLanguages(String url, boolean filterArchived, boolean archivedValue) {
        return webClient.get()
                .uri("/" + url)
                .retrieve()
                .bodyToMono(String.class)
                .map(json -> {
                    LanguageList.Builder builder = LanguageList.newBuilder();
                    try {
                        JsonNode root = objectMapper.readTree(json);
                        for (JsonNode node : root) {
                            boolean isArchived = node.get("is_archived").asBoolean();
                            if (!filterArchived || isArchived == archivedValue) {
                                Language language = Language.newBuilder()
                                        .setId(node.get("id").asInt())
                                        .setName(node.get("name").asText())
                                        .setIsArchived(isArchived)
                                        .build();
                                builder.addLanguages(language);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace(); // Better to use logger in production
                    }
                    return builder.build();
                });
    }

    @Override
    public void getAllLanguages(Empty request, StreamObserver<LanguageList> responseObserver) {
        fetchLanguages("languages", false, false).subscribe(
                responseObserver::onNext,
                throwable -> {
                    throwable.printStackTrace();
                    responseObserver.onError(throwable);
                },
                responseObserver::onCompleted
        );
    }

    @Override
    public void getActiveLanguages(Empty request, StreamObserver<LanguageList> responseObserver) {
        fetchLanguages("languages", true, false).subscribe(
                responseObserver::onNext,
                throwable -> {
                    throwable.printStackTrace();
                    responseObserver.onError(throwable);
                },
                responseObserver::onCompleted
        );
    }

    @Override
    public void getArchivedLanguages(Empty request, StreamObserver<LanguageList> responseObserver) {
        fetchLanguages("languages", true, true).subscribe(
                responseObserver::onNext,
                throwable -> {
                    throwable.printStackTrace();
                    responseObserver.onError(throwable);
                },
                responseObserver::onCompleted
        );
    }

    @Override
    public void getLanguageById(LanguageId request, StreamObserver<Language> responseObserver) {
        int id = request.getId();
        webClient.get()
                .uri("/languages/" + id)
                .retrieve()
                .bodyToMono(String.class)
                .map(json -> {
                    try {
                        JsonNode node = objectMapper.readTree(json);
                        return Language.newBuilder()
                                .setId(node.get("id").asInt())
                                .setName(node.get("name").asText())
                                .setIsArchived(node.get("is_archived").asBoolean())
                                .setSourceFile(node.has("source_file") ? node.get("source_file").asText() : "")
                                .setRunCmd(node.has("run_cmd") ? node.get("run_cmd").asText() : "")
                                .setCompileCmd(node.has("compile_cmd") && !node.get("compile_cmd").isNull() ? node.get("compile_cmd").asText() : "")
                                .build();
                    } catch (Exception e) {
                        e.printStackTrace();
                        return null;
                    }
                })
                .subscribe(
                        language -> {
                            if (language != null) {
                                responseObserver.onNext(language);
                                responseObserver.onCompleted();
                            } else {
                                responseObserver.onError(new RuntimeException("Invalid response from Judge0"));
                            }
                        },
                        throwable -> {
                            throwable.printStackTrace();
                            responseObserver.onError(throwable);
                        }
                );
    }
}
