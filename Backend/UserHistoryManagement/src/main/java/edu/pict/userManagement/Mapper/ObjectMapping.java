package edu.pict.userManagement.Mapper;

import edu.pict.userHistory.UserHistory;
import edu.pict.userManagement.models.HistoryEntity;

import java.util.UUID;

public class ObjectMapping {
    public static HistoryEntity userHistoryToQuestionAndUserMapping(UserHistory userHistory) {
        return HistoryEntity.builder()
                .questionId(UUID.fromString(userHistory.getQuestionId()))
                .submissionId(UUID.fromString(userHistory.getSubmissionId()))
                .username(userHistory.getUsername())
                .build();
    }
}
