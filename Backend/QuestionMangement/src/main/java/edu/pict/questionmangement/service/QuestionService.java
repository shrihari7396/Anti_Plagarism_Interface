package edu.pict.questionmangement.service;

import edu.pict.questionmangement.dto.questionServiceDto.QuestionRequestDTO;
import edu.pict.questionmangement.dto.questionServiceDto.QuestionResponseDTO;
import edu.pict.questionmangement.dto.textCaseServiceDto.TestCasesDto;
import edu.pict.questionmangement.exception.QuestionNotFoundException;
import edu.pict.questionmangement.mapper.QuestionMapper;
import edu.pict.questionmangement.model.Question;
import edu.pict.questionmangement.model.Topic;
import edu.pict.questionmangement.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class QuestionService {

    private final QuestionRepository questionRepository;
    private final TopicService topicService;
    private final AsyncTestCaseProcessor asyncTestCaseProcessor;
    private final TestCaseServiceImpl testCaseServiceImpl;

    /**
     * FAST API
     * Only DB operations are synchronous
     */
    public QuestionResponseDTO addQuestion(QuestionRequestDTO request, MultipartFile file) {

        Question question = createQuestion(request);

        // Async heavy work
        asyncTestCaseProcessor.process(question.getId(), file);

        return QuestionResponseDTO.builder()
                .id(question.getId())
                .title(question.getTitle())
                .description(question.getDescription())
                .constraints(question.getConstraints())
                .difficulty(question.getDifficulty())
                .createdAt(question.getCreatedAt())
                .updatedAt(question.getUpdatedAt())
                .topics(
                        question.getTopics()
                                .stream()
                                .map(QuestionMapper::toTopicResponseDto)
                                .toList()
                )
                .testcases(null) // async
                .build();
    }

    /**
     * DB-only transactional method
     */
    @Transactional
    protected Question createQuestion(QuestionRequestDTO request) {

        List<Topic> topics = topicService.getOrCreateTopics(request.getTopics());
        Question question = QuestionMapper.toEntity(request, topics);

        return questionRepository.save(question);
    }

    public List<QuestionResponseDTO> getPaginatedQuestions(int page, int size) {

        Pageable pageable = PageRequest.of(
                page,
                size,
                Sort.by("createdAt").descending()
        );

        Page<Question> questionPage = questionRepository.findAll(pageable);
        return questionPage.map(QuestionMapper::toResponseDto).toList();
    }

    public TestCasesDto getTestCasesByQuestionId(UUID questionId) {
        return testCaseServiceImpl.getTestCasesByQuestionId(questionId);
    }

    public QuestionResponseDTO getQuestionById(UUID id) {

        Question question = questionRepository.findById(id)
                .orElseThrow(() ->
                        new QuestionNotFoundException("Question not found", new Question())
                );

        TestCasesDto testCasesDto = getTestCasesByQuestionId(id);

        return QuestionMapper.toTopicResponseDtoWithTestCasesDto(question, testCasesDto);
    }

    public void deleteQuestion(UUID id) {

        questionRepository.deleteById(id);
        testCaseServiceImpl.deleteTestCasesByQuestionId(id);
    }
}
