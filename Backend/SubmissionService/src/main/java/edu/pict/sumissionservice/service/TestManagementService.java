package edu.pict.sumissionservice.service;

import edu.pict.sumissionservice.dtos.testcaseServiceDto.TestCaseDto;
import edu.pict.sumissionservice.mapper.TestCaseServiceMapper;
import edu.pict.testCaseService.TestCase;
import edu.pict.testCaseService.TestCaseRequest;
import edu.pict.testCaseService.TestCaseResponse;
import edu.pict.testCaseService.TestCaseServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TestManagementService {

    @GrpcClient("TestCaseService")
    private TestCaseServiceGrpc.TestCaseServiceBlockingStub  testCaseServiceBlockingStub;

    public List<TestCaseDto> getTestCasesByQuestionId(UUID questionId) {
        TestCaseRequest request = TestCaseRequest.newBuilder()
                .setQuestionId(questionId.toString())
                .build();

        TestCaseResponse testCases = testCaseServiceBlockingStub.getTestCasesByQuestionId(request);

        List<TestCase> testCaseList = testCases.getTestcasesList();
        return testCaseList.stream()
                .map(TestCaseServiceMapper::testCaseResponseToTestCaseDto)
                .toList();
    }

    public List<TestCaseDto> getVisibleTestCasesByQuestionId(UUID questionId) {
        TestCaseRequest request = TestCaseRequest.newBuilder()
                .setQuestionId(questionId.toString())
                .build();

        TestCaseResponse testCases = testCaseServiceBlockingStub.getVisibleTestCasesByQuestionId(request);
        List<TestCase> testCasesList = testCases.getTestcasesList();

        return testCasesList.stream()
                .map(TestCaseServiceMapper::testCaseResponseToTestCaseDto)
                .toList();
    }

    public List<TestCaseDto> getAllTestCasesByQuestionId(UUID questionId) {
        TestCaseRequest request = TestCaseRequest.newBuilder()
                .setQuestionId(questionId.toString())
                .build();

        TestCaseResponse testCases = testCaseServiceBlockingStub.getTestCasesByQuestionId(request);
        List<TestCase> testCasesList = testCases.getTestcasesList();

        return testCasesList.stream()
                .map(TestCaseServiceMapper::testCaseResponseToTestCaseDto)
                .toList();
    }

    public TestCaseDto getFinalTestCase(UUID questionId) {
        List<TestCaseDto> allTestCases  = getTestCasesByQuestionId(questionId);

        StringBuilder input = new StringBuilder();
        StringBuilder expected = new StringBuilder();

        for(TestCaseDto testCase: allTestCases){
            input.append(testCase.getInput());
            expected.append(testCase.getExpected());
            input.append("\n");
            expected.append("\n");
        }

        return TestCaseDto.builder()
                .input(input.toString())
                .expected(expected.toString())
                .build();
    }
}
