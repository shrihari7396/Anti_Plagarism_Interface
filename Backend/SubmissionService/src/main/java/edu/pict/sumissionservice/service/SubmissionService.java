package edu.pict.sumissionservice.service;

import edu.pict.grpc.submission.ExecutionResult;
import edu.pict.grpc.submission.SubmissionRequest;
import edu.pict.grpc.submission.SubmissionResponseToken;
import edu.pict.grpc.submission.SubmissionServiceGrpc;
import edu.pict.sumissionservice.dtos.ExecutionResultDto;
import edu.pict.sumissionservice.dtos.SubmissionRequestDto;
import edu.pict.sumissionservice.dtos.SubmissionResponseDto;
import edu.pict.sumissionservice.dtos.TestCaseDto;
import edu.pict.sumissionservice.mapper.SubmissionServiceMapper;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// All Method are written in this class are use in controller for give back response to user
@Service
public class SubmissionService {

    // Works as Grpc Client helps in calling grpc method
    // Configuration are present in application.yml file
    @GrpcClient("codeSubmission")
    private SubmissionServiceGrpc.SubmissionServiceBlockingStub serviceBlockingStub;

    @Autowired
    private TestManagementService  testManagementService;

    // Queue
    public SubmissionResponseDto submitCode(SubmissionRequestDto submissionRequestDto) {
        // This will Extract the Testcase for test Case Service and Add it request Body of Judge0
        TestCaseDto testCaseDto = testManagementService.getFinalTestCase(submissionRequestDto.getQuestionId());
        submissionRequestDto.setStdin(testCaseDto.getInput());
        submissionRequestDto.setExpectedOutput(testCaseDto.getExpected());

        // This will Map the Communication and DTO Objects
        SubmissionRequest request = SubmissionServiceMapper.submissionRequestDtoToSubmissionRequest(submissionRequestDto); // Mapping is Done in Mapper class Using its static functions
        SubmissionResponseToken token = serviceBlockingStub.submitRequest(request); // Calling Grpc Method
        return SubmissionResponseDto.builder().token(token.getToken()).build();
    }

    public ExecutionResultDto getResponseUsingToken(SubmissionResponseDto submissionResponseDto) {
        SubmissionResponseToken token = SubmissionServiceMapper.submissionResponseDtoToSubmissionResponseToken(submissionResponseDto); // Mapping is Done in Mapper class Using its static functions
        ExecutionResult result = serviceBlockingStub.getResultByExecutionToken(token); // Calling Grpc Method
        return SubmissionServiceMapper.executionResultToExecutionResultDto(result);
    }

    // Direct Execution
    public ExecutionResultDto instantExecutionResult(SubmissionRequestDto submissionRequestDto) {
        // This will Map the Communication and DTO Objects
        SubmissionRequest request = SubmissionServiceMapper.submissionRequestDtoToSubmissionRequest(submissionRequestDto); // Mapping is Done in Mapper class Using its static functions

        // This will Extract the Testcase for test Case Service and Add it request Body of Judge0
        TestCaseDto testCaseDto = testManagementService.getFinalTestCase(submissionRequestDto.getQuestionId());
        submissionRequestDto.setStdin(testCaseDto.getInput());
        submissionRequestDto.setExpectedOutput(testCaseDto.getExpected());

        ExecutionResult result = serviceBlockingStub.instantExecutionResult(request); // Calling Grpc Method
        return SubmissionServiceMapper.executionResultToExecutionResultDto(result);
    }

}
