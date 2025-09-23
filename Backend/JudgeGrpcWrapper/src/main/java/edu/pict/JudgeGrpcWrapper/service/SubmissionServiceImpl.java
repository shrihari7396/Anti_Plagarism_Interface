package edu.pict.JudgeGrpcWrapper.service;

import edu.pict.JudgeGrpcWrapper.dots.ExecutionResultDto;
import edu.pict.JudgeGrpcWrapper.mapper.Mapper;
import edu.pict.grpc.submission.*;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.grpc.server.service.GrpcService;
import org.springframework.web.client.RestClient;

import java.util.Map;

@GrpcService
public class SubmissionServiceImpl extends SubmissionServiceGrpc.SubmissionServiceImplBase {

    @Autowired
    private Judge0Service judge0Service;

    @Autowired
    private RestClient.Builder builder;

    @Override
    public void submitRequest(SubmissionRequest request,
                              StreamObserver<SubmissionResponseToken> responseObserver) {

        SubmissionResponseToken response = SubmissionResponseToken.newBuilder()
                .setToken(judge0Service.submitRequest(request).get("token").toString())

                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getResultByExecutionToken(SubmissionResponseToken token, StreamObserver<ExecutionResult> responseObserver) {
        ExecutionResultDto resultDto = judge0Service.getResponse(token).block();

        assert resultDto != null;

        ExecutionResult.Status status = ExecutionResult.Status.newBuilder()
                .setId(resultDto.getStatus().getId())
                .setDescription(resultDto.getStatus().getDescription())
                .build();

        ExecutionResult result = ExecutionResult.newBuilder()
                .setStdout(resultDto.getStdout() == null ? "" : resultDto.getStdout())
                .setTime(resultDto.getTime() == null ? "" : resultDto.getTime())
                .setMemory(resultDto.getMemory() == null ? "" : resultDto.getMemory())
                .setStderr(resultDto.getStderr() == null ? "" : resultDto.getStderr())
                .setToken(resultDto.getToken() == null ? "" : resultDto.getToken())
                .setCompileOutput(resultDto.getCompile_output() == null ? "" : resultDto.getCompile_output())
                .setMessage(resultDto.getMessage() == null ? "" : resultDto.getMessage())
                .setStatus(status)
                .build();

        responseObserver.onNext(result);
        responseObserver.onCompleted();
    }

    @Override
    public void instantExecutionResult(SubmissionRequest submissionRequest, StreamObserver<ExecutionResult> responseObserver) {
        Map<String, Object> resultMap = judge0Service.instantExecutionResult(submissionRequest);

        ExecutionResultDto resultDto = Mapper.mapToExecutionResultDto(resultMap);

        assert resultDto != null;

        ExecutionResult.Status status = ExecutionResult.Status.newBuilder()
                .setId(resultDto.getStatus().getId())
                .setDescription(resultDto.getStatus().getDescription())
                .build();

        ExecutionResult result = ExecutionResult.newBuilder()
                .setStdout(resultDto.getStdout())
                .setTime(resultDto.getTime())
                .setMemory(resultDto.getTime())
                .setToken(resultDto.getToken())
                .setCompileOutput(resultDto.getCompile_output())
                .setMessage(resultDto.getMessage())
                .setStatus(status)
                .build();

        responseObserver.onNext(result);
        responseObserver.onCompleted();
    }

    @Override
    public void submitCode (BatchSubmissionRequest request, StreamObserver<BatchSubmissionTokens> responseObserver) {

    }

    @Override
    public void getSubmitCodeResponseFromTokens(BatchSubmissionTokens request, StreamObserver<BatchSubmissionTokensResponse> responseStreamObserver){

    }

}
