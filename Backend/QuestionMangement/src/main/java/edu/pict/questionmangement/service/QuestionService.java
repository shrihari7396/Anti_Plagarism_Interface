package edu.pict.questionmangement.service;

import edu.pict.questionmangement.dto.QuestionRequestDTO;
import edu.pict.questionmangement.exception.QuestionNotFoundException;
import edu.pict.questionmangement.dto.QuestionResponseDTO;
import edu.pict.questionmangement.mapper.QuestionMapper;
import edu.pict.questionmangement.model.Question;
import edu.pict.questionmangement.model.Topic;
import edu.pict.questionmangement.repository.QuestionRepository;
import edu.pict.questionmangement.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private TopicRepository topicRepository;

    @Autowired
    private TestCaseServiceImpl  testCaseServiceImpl;

    public Page<QuestionResponseDTO> getPaginatedQuestions(int page, int size) {
        Pageable pageable = PageRequest.of(page, size, Sort.by("createdAt").ascending());
        Page<Question> questionPage = questionRepository.findAll(pageable);
        return questionPage.map(QuestionMapper::toResponseDto);
    }

    public Optional<QuestionResponseDTO> getQuestionById(Long id) {
        Optional<Question> question = questionRepository.findById(id);
        return question.map(value -> Optional.of(QuestionMapper.toResponseDto(value))).orElseThrow(() -> new QuestionNotFoundException("Question not found", new Question()));
    }

    public QuestionResponseDTO createQuestion(QuestionRequestDTO questionRequestDTO) {
        List<Topic> topics = questionRequestDTO.getTopics().parallelStream()
                .map(dto -> topicRepository.findByTopic(dto.getTopic())
                        .orElseGet(() -> topicRepository.save(
                                new Topic(dto.getTopic())
                        ))
                )
                .toList();
        Question question = QuestionMapper.toEntity(questionRequestDTO, topics);
        questionRepository.save(question);
        return QuestionMapper.toResponseDto(question);
    }

    public void deleteQuestion(Long id) {
        questionRepository.deleteById(id);
    }

}
