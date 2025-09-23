package edu.pict.userManagement.projections;

import java.util.UUID;

public interface SubmissionAndQuestionProjection {
    UUID getQuestionId();
    UUID submissionId();
}
