package edu.pict.userManagement.repository;

import edu.pict.userManagement.models.HistoryEntity;
import edu.pict.userManagement.projections.SubmissionAndQuestionProjection;
import edu.pict.userManagement.projections.SubmissionProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface HistoryEntityRepository extends JpaRepository<HistoryEntity,Integer> {

    // Fetches submission from questionId and username
    Page<SubmissionProjection> findByUsernameAndQuestionId(String username, UUID questionId, Pageable pageable);

    // Fetches Submission and QuestionId from the username
    Page<SubmissionAndQuestionProjection> findByUsername(String username, Pageable pageable);

    // Used for deleting data
    void deleteAllByQuestionId(UUID questionId);
    void deleteAllByUsername(String username);
}
