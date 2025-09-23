package edu.pict.testCaseService.service;

import edu.pict.testCaseService.*;
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
        try {
            List<TestcaseEntity> testcaseEntities = TestCaseMapper.testcasesToTestcaseEntities(request);
            testcaseRepository.saveAll(testcaseEntities);
            responseObserver.onNext(request);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
            responseObserver.onCompleted();
        }
    }

    @Override
    public void getTestCasesByQuestionId(TestCaseRequest request,
                                         StreamObserver<TestCaseResponse> responseObserver) {
        try {
            List<TestcaseEntity> testcaseEntities = testcaseRepository.findByQuestionId(UUID.fromString(request.getQuestionId()));
            List<TestCase> testCases = testcaseEntities.stream().map(TestCaseMapper::testCaseEntityToTestCase).toList();
            TestCaseResponse response = TestCaseResponse.newBuilder()
                    .addAllTestcases(testCases)
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
            responseObserver.onCompleted();
        }
    }

    @Override
    public void getVisibleTestCasesByQuestionId(TestCaseRequest request, StreamObserver<TestCaseResponse> responseObserver) {
        try {
            List<TestcaseEntity> visibleTestcases = testcaseRepository.findByQuestionIdAndHidden(UUID.fromString(request.getQuestionId()), false);
            List<TestCase> testCases = visibleTestcases.stream().map(TestCaseMapper::testCaseEntityToTestCase).toList();
            TestCaseResponse response = TestCaseResponse.newBuilder()
                    .addAllTestcases(testCases)
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
            responseObserver.onCompleted();
        }
    }


    @Override
    public void deleteTestCasesByQuestionID(DeleteTestCaseRequest deleteRequest, StreamObserver<DeleteTestCaseResponse> responseStreamObserver) {
        try {
            testcaseRepository.deleteByQuestionId(UUID.fromString(deleteRequest.getQuestionId()));
            responseStreamObserver.onNext(DeleteTestCaseResponse.newBuilder().build());
            responseStreamObserver.onCompleted();
        } catch (Exception e) {
            responseStreamObserver.onError(e);
            responseStreamObserver.onCompleted();
        }
    }
}
