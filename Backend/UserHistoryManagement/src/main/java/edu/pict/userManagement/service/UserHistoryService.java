package edu.pict.userManagement.service;

import edu.pict.userHistory.*;
import edu.pict.userManagement.Mapper.ObjectMapping;
import edu.pict.userManagement.models.HistoryEntity;
import edu.pict.userManagement.projections.QuestionAndSubmissionProjection;
import edu.pict.userManagement.repository.HistoryEntityRepository;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserHistoryService extends UserHistoryServiceGrpc.UserHistoryServiceImplBase {

    @Autowired
    private HistoryEntityRepository historyEntityRepository;

    /**
     * Register user history when a submission is made.
     */
    @Override
    public void registerHistory(UserHistory request, StreamObserver<RegisterHistoryResponse> responseObserver) {
        try {
            // Create mapping object
            HistoryEntity mapping = ObjectMapping.userHistoryToQuestionAndUserMapping(request);

            // Save into repository
            historyEntityRepository.save(mapping);

            // Build response
            RegisterHistoryResponse response = RegisterHistoryResponse.newBuilder()
                    .setResponse("History registered successfully for user: " + request.getUsername())
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();

        } catch (Exception e) {
            RegisterHistoryResponse response = RegisterHistoryResponse.newBuilder()
                    .setResponse("Failed to register history: " + e.getMessage())
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }

    public void fetchHistoryByUsernameAndQuestionId(FetchRequest request, StreamObserver<FetchResponse> responseObserver) {
        List<QuestionAndSubmissionProjection> fetchResult = historyEntityRepository.
    }

    /**
     * Delete history by username
     */
    @Override
    public void deleteHistoryByUsername(DeleteHistoryByUsername request, StreamObserver<DeleteResponse> responseObserver) {
        try {
            // You can add repository method like deleteByUsername(String username)
            historyEntityRepository.deleteAllByUsername(request.getUsername());

            DeleteResponse response = DeleteResponse.newBuilder()
                    .setResponse("History deleted for username: " + request.getUsername())
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();

        } catch (Exception e) {
            DeleteResponse response = DeleteResponse.newBuilder()
                    .setResponse("Failed to delete history: " + e.getMessage())
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }

    /**
     * Delete history by questionId
     */
    @Override
    public void deleteHistoryByQuestionId(DeleteHistoryByQuestionId request, StreamObserver<DeleteResponse> responseObserver) {
        try {
            UUID questionId = UUID.fromString(request.getQuestionId());

            // You can add repository method like deleteByQuestionId(UUID questionId)
            historyEntityRepository.deleteAllByQuestionId(questionId);

            DeleteResponse response = DeleteResponse.newBuilder()
                    .setResponse("History deleted for questionId: " + request.getQuestionId())
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();

        } catch (Exception e) {
            DeleteResponse response = DeleteResponse.newBuilder()
                    .setResponse("Failed to delete history: " + e.getMessage())
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }
}
