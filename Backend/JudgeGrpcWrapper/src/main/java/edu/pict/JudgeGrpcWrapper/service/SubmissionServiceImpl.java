package edu.pict.JudgeGrpcWrapper.service;

import edu.pict.SubmissionRequest;
import edu.pict.SubmissionResponseToken;
import edu.pict.SubmissionServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.grpc.server.service.GrpcService;
import org.springframework.web.reactive.function.client.WebClient;

import static edu.pict.SubmissionServiceGrpc.getSubmitRequestMethod;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

@GrpcService
public class SubmissionServiceImpl extends SubmissionServiceGrpc.SubmissionServiceImplBase {

    @Autowired
    private Judge0Service judge0Service;

    @Override
    public void submitRequest(SubmissionRequest request,
                              StreamObserver<SubmissionResponseToken> responseObserver) {
        SubmissionResponseToken response = judge0Service.submitRequest(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
