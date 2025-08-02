package edu.pict.ecommerce.questionmangement.service;

import edu.pict.TestCaseRequest;
import edu.pict.TestCaseResponse;
import edu.pict.TestCaseServiceGrpc;
import edu.pict.TestCases;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TestCaseServiceImpl {

    @GrpcClient("TestCaseService")
    private TestCaseServiceGrpc.TestCaseServiceBlockingStub testCaseServiceBlockingStub;

    public TestCases stroreTestCases(TestCases testCases) {
        return testCaseServiceBlockingStub.storeTestCases(testCases);
    }

    public TestCaseResponse getTestCasesByQuestionId(UUID questionId) {
        TestCaseResponse testCases =  testCaseServiceBlockingStub
                .getTestCasesByQuestionId(
                        TestCaseRequest.newBuilder()
                                .setQuestionId(questionId.toString())
                                .build()
                );

        return null;
    }
}
