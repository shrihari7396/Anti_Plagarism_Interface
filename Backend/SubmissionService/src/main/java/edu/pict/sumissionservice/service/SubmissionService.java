package edu.pict.sumissionservice.service;

import edu.pict.ExecutionResult;
import edu.pict.SubmissionRequest;
import edu.pict.SubmissionResponseToken;
import edu.pict.SubmissionServiceGrpc;
import edu.pict.sumissionservice.dtos.ExecutionResultDto;
import edu.pict.sumissionservice.dtos.SubmissionRequestDto;
import edu.pict.sumissionservice.dtos.SubmissionResponseDto;
import edu.pict.sumissionservice.mapper.Mapper;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

// All Method are written in this class are use in controller for give back response to user
@Service
public class SubmissionService {

    // Works as Grpc Client helps in calling grpc method
    // Configuration are present in application.yml file
    @GrpcClient("codeSubmission")
    private SubmissionServiceGrpc.SubmissionServiceBlockingStub serviceBlockingStub;

    public SubmissionResponseDto submitCode(SubmissionRequestDto submissionRequestDto) {
        SubmissionRequest request = Mapper.submissionRequestDtoToSubmissionRequest(submissionRequestDto); // Mapping is Done in Mapper class Using its static functions
        SubmissionResponseToken token = serviceBlockingStub.submitRequest(request); // Calling Grpc Method
        return SubmissionResponseDto.builder().token(token.getToken()).build();
    }

    public ExecutionResultDto getResponseUsingToken(SubmissionResponseDto submissionResponseDto) {
        SubmissionResponseToken token = Mapper.submissionResponseDtoToSubmissionResponseToken(submissionResponseDto); // Mapping is Done in Mapper class Using its static functions
        ExecutionResult result = serviceBlockingStub.getResultByExecutionToken(token); // Calling Grpc Method
        return Mapper.executionResultToExecutionResultDto(result);
    }

    public ExecutionResultDto instantExecutionResult(SubmissionRequestDto submissionRequestDto) {
        SubmissionRequest request = Mapper.submissionRequestDtoToSubmissionRequest(submissionRequestDto); // Mapping is Done in Mapper class Using its static functions
        ExecutionResult result = serviceBlockingStub.instantExecutionResult(request); // Calling Grpc Method
        return Mapper.executionResultToExecutionResultDto(result);
    }

}
