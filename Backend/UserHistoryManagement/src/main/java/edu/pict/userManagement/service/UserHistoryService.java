package edu.pict.userManagement.service;

import edu.pict.grpc.userHistory.*;
import edu.pict.userManagement.Mapper.ObjectMapping;
import edu.pict.userManagement.models.HistoryEntity;
import edu.pict.userManagement.projections.SubmissionAndQuestionProjection;
import edu.pict.userManagement.projections.SubmissionProjection;
import edu.pict.userManagement.repository.HistoryEntityRepository;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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

    /**
     * Give Complete History of user.
     */
    @Override
    public void fetchUserHistoryByUsername(FetchUserHistoryRequest request,
                                           StreamObserver<FetchUserHistoryResponse> responseObserver) {
        try {
            // Default size if not provided
            int page = request.getPage() >= 0 ? request.getPage() : 0;
            int size = request.getSize() > 0 ? request.getSize() : 10;

            Page<SubmissionAndQuestionProjection> pageResult =
                    historyEntityRepository.findByUsername(
                            request.getUsername(),
                            PageRequest.of(page, size)
                    );

            List<FetchUserHistoryResponseOne> historyResponseOnes = pageResult.getContent().stream()
                    .map(submission -> FetchUserHistoryResponseOne.newBuilder()
                            .setQuestionId(submission.getQuestionId().toString())
                            .setSubmissionId(submission.submissionId().toString())
                            .build())
                    .toList();

            FetchUserHistoryResponse response = FetchUserHistoryResponse.newBuilder()
                    .setUsername(request.getUsername())
                    .addAllQuestionHistoryOfUser(historyResponseOnes)
                    .setPageNumber(pageResult.getNumber())
                    .setTotalPages(pageResult.getTotalPages())
                    .setTotalElements(pageResult.getTotalElements())
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
            responseObserver.onCompleted();
        }
    }
    @Override
    public void fetchUserHistoryByUsernameAndQuestionId(FetchUserHistoryByUsernameAndQuestionIdRequest request, StreamObserver<FetchUserHistoryByUsernameAndQuestionIdResponse> responseObserver) {
        try {
            Page<SubmissionProjection> pageResult = historyEntityRepository.findByUsernameAndQuestionId(request.getUsername(), UUID.fromString(request.getQuestionId()), PageRequest.of(request.getPage(), request.getSize()));
            List<FetchUserHistoryByUsernameAndQuestionIdResponseOne> fetchUserHistoryByUsernameAndQuestionIdResponseOnes = ObjectMapping.submissionProjectToFetchUserHistoryByUsernameAndQuestionIdOnes(pageResult.toList());
            FetchUserHistoryByUsernameAndQuestionIdResponse fetchUserHistoryByUsernameAndQuestionIdResponse = FetchUserHistoryByUsernameAndQuestionIdResponse.newBuilder()
                    .addAllSubmissions(fetchUserHistoryByUsernameAndQuestionIdResponseOnes)
                    .setPageNumber(pageResult.getNumber())
                    .setTotalPages(pageResult.getTotalPages())
                    .setTotalElements(pageResult.getTotalElements())
                    .build();
            responseObserver.onNext(fetchUserHistoryByUsernameAndQuestionIdResponse);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
            responseObserver.onCompleted();
        }
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
