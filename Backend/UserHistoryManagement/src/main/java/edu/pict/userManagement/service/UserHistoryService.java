package edu.pict.userManagement.service;

import edu.pict.userManagement.models.QuestionAndUserMapping;
import edu.pict.userManagement.repository.QuestionAndUserMappingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserHistoryService  {

    @Autowired
    private QuestionAndUserMappingRepository questionAndUserMappingRepository;

    public QuestionAndUserMapping addMapping(QuestionAndUserMapping questionAndUserMapping) {
        return questionAndUserMappingRepository.save(questionAndUserMapping);
    }

    public List<QuestionAndUserMapping> getQuestionByUserIdAndQuestionId(String username,  UUID questionId) {
        return questionAndUserMappingRepository.findByUsernameAndQuestionId(username,questionId);
    }


}
