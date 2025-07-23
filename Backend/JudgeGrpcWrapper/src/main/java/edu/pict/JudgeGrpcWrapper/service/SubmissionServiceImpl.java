package edu.pict.JudgeGrpcWrapper.service;

import edu.pict.SubmissionRequest;
import edu.pict.SubmissionResponseToken;
import edu.pict.SubmissionServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.grpc.server.service.GrpcService;

@GrpcService
public class SubmissionServiceImpl extends SubmissionServiceGrpc.SubmissionServiceImplBase {

    @Autowired
    private Judge0Service judge0Service;

    @Override
    public void submitRequest(SubmissionRequest request,
                              StreamObserver<SubmissionResponseToken> responseObserver) {
        SubmissionResponseToken response = SubmissionResponseToken.newBuilder().setToken(judge0Service.submitRequest(request).get("token").toString()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
