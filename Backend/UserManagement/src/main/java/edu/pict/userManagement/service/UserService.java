package edu.pict.userManagement.service;

import edu.pict.userManagement.models.QuestionAndUserMapping;
import edu.pict.userManagement.models.User;
import edu.pict.userManagement.repository.QuestionAndUserMappingRepository;
import edu.pict.userManagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private QuestionAndUserMappingRepository questionAndUserMappingRepository;

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public QuestionAndUserMapping addMapping(QuestionAndUserMapping questionAndUserMapping) {
        return questionAndUserMappingRepository.save(questionAndUserMapping);
    }

    public List<QuestionAndUserMapping> getQuestionByUserId(String username) {
        return questionAndUserMappingRepository.findByUsername(username);
    }
}
