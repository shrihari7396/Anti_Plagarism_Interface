package edu.pict.sumissionservice.service;

import edu.pict.grpc.testcase.TestCase;
import edu.pict.grpc.testcase.TestCaseRequest;
import edu.pict.grpc.testcase.TestCaseResponse;
import edu.pict.grpc.testcase.TestCaseServiceGrpc;
import edu.pict.sumissionservice.dtos.testcaseServiceDto.TestCaseDto;
import edu.pict.sumissionservice.mapper.TestCaseServiceMapper;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TestManagementService {

    @GrpcClient("TestCaseService")
    private TestCaseServiceGrpc.TestCaseServiceBlockingStub  testCaseServiceBlockingStub;

    private List<TestCaseDto> getTestCasesByQuestionId(UUID questionId) {
        TestCaseRequest request = TestCaseRequest.newBuilder()
                .setQuestionId(questionId.toString())
                .build();

        TestCaseResponse testCases = testCaseServiceBlockingStub.getTestCasesByQuestionId(request);

        List<TestCase> testCaseList = testCases.getTestcasesList();
        return testCaseList.stream()
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
