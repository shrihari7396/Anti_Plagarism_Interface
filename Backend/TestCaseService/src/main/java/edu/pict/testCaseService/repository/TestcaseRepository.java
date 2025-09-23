package edu.pict.testCaseService.repository;

import edu.pict.testCaseService.model.TestcaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface TestcaseRepository extends JpaRepository<TestcaseEntity, Integer> {
    List<TestcaseEntity> findByQuestionId(UUID questionId);
    List<TestcaseEntity> findByQuestionIdAndHidden(UUID questionId, boolean hidden);
    void deleteByQuestionId(UUID questionId);
}
