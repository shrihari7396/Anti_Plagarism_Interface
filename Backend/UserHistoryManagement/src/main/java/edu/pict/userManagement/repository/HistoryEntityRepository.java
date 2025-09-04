package edu.pict.userManagement.repository;

import edu.pict.userManagement.models.HistoryEntity;
import edu.pict.userManagement.projections.QuestionAndSubmissionProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface HistoryEntityRepository extends JpaRepository<HistoryEntity,Integer> {

    List<HistoryEntity> findByQuestionId(UUID questionId);
    List<QuestionAndSubmissionProjection> findByUsernameAndQuestionId(String username, UUID questionId);

    // Used for deleting data
    void deleteAllByQuestionId(UUID questionId);
    void deleteAllByUsername(String username);
}
