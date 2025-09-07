package edu.pict.sumissionservice.service;

import edu.pict.grpc.userHistory.*;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class UserHistoryManagementService {
    @GrpcClient("UserHistoryManagement")
    private UserHistoryServiceGrpc.UserHistoryServiceBlockingStub userHistoryServiceBlockingStub;

    public RegisterHistoryResponse registerHistory(UserHistory userHistory) {
        return userHistoryServiceBlockingStub.registerHistory(userHistory);
    }

    public FetchUserHistoryResponse fetchUserHistory(FetchUserHistoryRequest fetchUserHistoryRequest) {
        return userHistoryServiceBlockingStub.fetchUserHistoryByUsername(fetchUserHistoryRequest);
    }

    public FetchUserHistoryByUsernameAndQuestionIdResponse fetchUserHistoryByUsernameAndQuestionId(FetchUserHistoryByUsernameAndQuestionIdRequest fetchUserHistoryByUsernameAndQuestionIdRequest) {
        return userHistoryServiceBlockingStub.fetchUserHistoryByUsernameAndQuestionId(fetchUserHistoryByUsernameAndQuestionIdRequest);
    }

    public DeleteResponse deleteHistoryByUsername(DeleteHistoryByUsername deleteHistoryByUsername) {
        return userHistoryServiceBlockingStub.deleteHistoryByUsername(deleteHistoryByUsername);
    }

    public DeleteResponse deleteHistoryByQuestionId(DeleteHistoryByQuestionId deleteHistoryByQuestionId) {
        return userHistoryServiceBlockingStub.deleteHistoryByQuestionId(deleteHistoryByQuestionId);
    }
}
