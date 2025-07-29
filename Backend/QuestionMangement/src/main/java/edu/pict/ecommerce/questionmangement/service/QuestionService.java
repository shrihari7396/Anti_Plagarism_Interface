package edu.pict.ecommerce.questionmangement.service;

import edu.pict.ecommerce.questionmangement.dto.QuestionResponseDTO;
import edu.pict.ecommerce.questionmangement.mapper.QuestionMapper;
import edu.pict.ecommerce.questionmangement.model.Question;
import edu.pict.ecommerce.questionmangement.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public Page<QuestionResponseDTO> getPaginatedQuestions(int page, int size) {
        Pageable pageable = PageRequest.of(page, size, Sort.by("createdAt").descending());
        Page<Question> questionPage = questionRepository.findAll(pageable);
        return questionPage.map(QuestionMapper::toResponseDto);
    }


}
