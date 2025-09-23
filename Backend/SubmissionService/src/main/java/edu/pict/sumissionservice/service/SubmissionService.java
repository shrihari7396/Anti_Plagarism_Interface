package edu.pict.sumissionservice.service;

import edu.pict.grpc.submission.ExecutionResult;
import edu.pict.grpc.submission.SubmissionRequest;
import edu.pict.grpc.submission.SubmissionResponseToken;
import edu.pict.grpc.submission.SubmissionServiceGrpc;
import edu.pict.grpc.userHistory.RegisterHistoryResponse;
import edu.pict.grpc.userHistory.UserHistory;
import edu.pict.sumissionservice.dtos.submissionDto.ExecutionResultDto;
import edu.pict.sumissionservice.dtos.submissionDto.SubmissionRequestDto;
import edu.pict.sumissionservice.dtos.submissionDto.SubmissionResponseDto;
import edu.pict.sumissionservice.dtos.testcaseServiceDto.TestCaseDto;
import edu.pict.sumissionservice.mapper.SubmissionServiceMapper;
import edu.pict.testCaseService.TestCase;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

// All Method are written
// in this class are use in controller for give back response to user
@Slf4j
@Service
public class SubmissionService {

    // Works as Grpc Client helps in calling grpc method
    // Configuration are present in application.yml file
    @GrpcClient("CodeSubmission")
    private SubmissionServiceGrpc.SubmissionServiceBlockingStub serviceBlockingStub;

    @Autowired
    private TestManagementService  testManagementService;

    @Autowired
    private UserHistoryManagementService userHistoryManagementService;

    // Queue
    @Async
    public CompletableFuture<SubmissionResponseDto> runCode(SubmissionRequestDto submissionRequestDto) {

        // This will Extract the Testcase for test Case Service and Add it request Body of Judge0
        TestCaseDto testCaseDto = testManagementService.getFinalTestCase(submissionRequestDto.getQuestionId());
        submissionRequestDto.setStdin(testCaseDto.getInput());
        submissionRequestDto.setExpectedOutput(testCaseDto.getExpected());

        // This will Map the Communication and DTO Objects
        SubmissionRequest request = SubmissionServiceMapper.submissionRequestDtoToSubmissionRequest(submissionRequestDto); // Mapping is Done in Mapper class Using its static functions
        SubmissionResponseToken token = serviceBlockingStub.submitRequest(request); // Calling Grpc Method

        // Final result
        SubmissionResponseDto finalResponse =  SubmissionResponseDto.builder()
                .token(token.getToken())
                .questionId(token.getQuestionId())
                .username(token.getUsername())
                .build();

        // Registers History of the user for submitting code of the question
        RegisterHistoryResponse registerHistoryResponse = userHistoryManagementService.registerHistory(
                UserHistory.newBuilder()
                        .setQuestionId(finalResponse.getQuestionId())
                        .setSubmissionId(finalResponse.getToken())
                        .setUsername(finalResponse.getUsername())
                        .build()
        );

        log.info("registerHistoryResponse={}", registerHistoryResponse);

        return CompletableFuture.completedFuture(finalResponse);
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

    @Async
    public CompletableFuture<SubmissionResponseDto> submit(SubmissionRequestDto submissionRequestDto) {
        List<TestCaseDto> testCases = testManagementService.getAllTestCasesByQuestionId(submissionRequestDto.getQuestionId());
        return null;
    }

}
