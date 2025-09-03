package edu.pict.userManagement.repository;

import edu.pict.userManagement.models.QuestionAndUserMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface QuestionAndUserMappingRepository extends JpaRepository<QuestionAndUserMapping,Integer> {
    List<QuestionAndUserMapping> findByQuestionId(UUID questionId);
    List<QuestionAndUserMapping> findByUsernameAndQuestionId(String username, UUID questionId);
}
