    package edu.pict.userManagement.Mapper;

    import edu.pict.grpc.userHistory.*;
    import edu.pict.userManagement.models.HistoryEntity;
    import edu.pict.userManagement.projections.SubmissionAndQuestionProjection;
    import edu.pict.userManagement.projections.SubmissionProjection;

    import java.util.ArrayList;
    import java.util.List;
    import java.util.UUID;

    public class ObjectMapping {
        public static HistoryEntity userHistoryToQuestionAndUserMapping(UserHistory userHistory) {
            return HistoryEntity.builder()
                    .questionId(UUID.fromString(userHistory.getQuestionId()))
                    .submissionId(UUID.fromString(userHistory.getSubmissionId()))
                    .username(userHistory.getUsername())
                    .build();
        }

        public static FetchUserHistoryResponse submissionAndQuestionProjectToFetchUserHistoryResponse(String username, List<SubmissionAndQuestionProjection> list) {
            List<FetchUserHistoryResponseOne> historyResponseOnes = new ArrayList<>();

            for(SubmissionAndQuestionProjection submission: list){
                FetchUserHistoryResponseOne res = FetchUserHistoryResponseOne.newBuilder()
                        .setQuestionId(submission.getQuestionId().toString())
                        .setSubmissionId(submission.submissionId().toString())
                        .build();
                historyResponseOnes.add(res);
            }

            return FetchUserHistoryResponse.newBuilder()
                    .setUsername(username)
                    .addAllQuestionHistoryOfUser(historyResponseOnes)
                    .build();
        }

        public static List<FetchUserHistoryByUsernameAndQuestionIdResponseOne> submissionProjectToFetchUserHistoryByUsernameAndQuestionIdOnes(List<SubmissionProjection> submissionProjections) {
            return submissionProjections.stream().map(
                    sub -> FetchUserHistoryByUsernameAndQuestionIdResponseOne.newBuilder()
                            .setSubmissionId(sub.getSubmissionId().toString())
                            .build()
            ).toList();
        }
    }
