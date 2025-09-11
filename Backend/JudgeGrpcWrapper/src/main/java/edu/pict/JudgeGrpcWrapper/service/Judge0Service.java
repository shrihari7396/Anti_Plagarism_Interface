package edu.pict.JudgeGrpcWrapper.service;

import edu.pict.JudgeGrpcWrapper.dots.ExecutionResultDto;
import edu.pict.JudgeGrpcWrapper.dots.RequestDto;
import edu.pict.JudgeGrpcWrapper.mapper.Mapper;
import edu.pict.grpc.submission.SubmissionRequest;
import edu.pict.grpc.submission.SubmissionResponseToken;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Map;

@Slf4j
@Service
public class Judge0Service {

    @Autowired
    private WebClient webClient;


    // This returns raw map of the response (for debugging)
    public Map<String, Object> submitRequest(SubmissionRequest submissionRequest) {
        RequestDto requestDto = Mapper.submissionRequestToRequestDto(submissionRequest);
        log.info("requestDto={}", requestDto);
        Map<String, Object> response = webClient.post()
                .uri("/submissions/?base64_encoded=false&wait=false")
                .header("Accept", "application/json;charset=utf-8")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .bodyValue(requestDto)
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<Map<String, Object>>() {})
                .block();
        log.info("response={}", response);
        return response;
    }

    public Mono<ExecutionResultDto> getResponse(SubmissionResponseToken submissionResponseToken) {
//        ExecutionResult
        log.info("submissionResponseToken={}", submissionResponseToken);
        return webClient.get()
                .uri("/submissions/" + submissionResponseToken.getToken())
                .retrieve()
                .bodyToMono(ExecutionResultDto.class);
    }

    public Map<String, Object> instantExecutionResult(SubmissionRequest submissionRequest) {
        log.info("submissionRequest={}", submissionRequest);
        return webClient.post()
                .uri("/submissions/?base64_encoded=false&wait=true")
                .header("Accept", "application/json;charset=utf-8")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .bodyValue(submissionRequest)
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<Map<String, Object>>() {})
                .block();
    }
}

