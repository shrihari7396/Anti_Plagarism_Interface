package edu.pict.testCaseService.service;

import edu.pict.*;
import edu.pict.testCaseService.mapper.TestCaseMapper;
import edu.pict.testCaseService.model.TestcaseEntity;
import edu.pict.testCaseService.repository.TestcaseRepository;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

@GrpcService
public class TestCaseService extends TestCaseServiceGrpc.TestCaseServiceImplBase {

    @Autowired
    private TestcaseRepository testcaseRepository;

    @Override
    public void storeTestCases(TestCases request,
                               StreamObserver<TestCases> responseObserver) {
        List<TestCase> testCases = request.getTestcasesList();
        List<TestcaseEntity> testcaseEntities = testCases.parallelStream().map(TestCaseMapper::testCaseToTestcaseEntity).toList();
        testcaseRepository.saveAll(testcaseEntities);
        responseObserver.onNext(request);
        responseObserver.onCompleted();
    }

    @Override
    public void getTestCasesByQuestionId(TestCaseRequest request,
                                         StreamObserver<TestCaseResponse> responseObserver) {
        List<TestcaseEntity> testcaseEntities = testcaseRepository.findByQuestionIdAndHidden(UUID.fromString(request.getQuestionId()), false);
        List<TestCase> testCases = testcaseEntities.parallelStream().map(TestCaseMapper::testCaseEntityToTestCase).toList();
        TestCaseResponse response = TestCaseResponse.newBuilder()
                .addAllTestcases(testCases)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
