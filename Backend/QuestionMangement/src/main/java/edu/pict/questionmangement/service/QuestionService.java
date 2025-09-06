package edu.pict.questionmangement.service;

import edu.pict.questionmangement.dto.questionServiceDto.QuestionRequestDTO;
import edu.pict.questionmangement.dto.questionServiceDto.QuestionResponseDTO;
import edu.pict.questionmangement.dto.questionServiceDto.TopicRequestDto;
import edu.pict.questionmangement.dto.questionServiceDto.TopicResponseDTO;
import edu.pict.questionmangement.dto.textCaseServiceDto.TestCasesDto;
import edu.pict.questionmangement.exception.QuestionNotFoundException;
import edu.pict.questionmangement.mapper.QuestionMapper;
import edu.pict.questionmangement.model.Question;
import edu.pict.questionmangement.model.Topic;
import edu.pict.questionmangement.repository.QuestionRepository;
import edu.pict.questionmangement.repository.TopicRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private TopicRepository topicRepository;

    @Autowired
    private TestCaseServiceImpl  testCaseServiceImpl;

    @Autowired
    private CSVFileParser csvFileParser;

    @Transactional
    public QuestionResponseDTO addQuestion(QuestionRequestDTO questionRequestDTO, MultipartFile file) {
        // Step 1: Extract topics from DTO
        List<TopicRequestDto> topicRequestDtos = questionRequestDTO.getTopics();

        // Step 2: Convert DTOs to Topic entities
        List<Topic> topics = topicRequestDtos.stream()
                .map(QuestionMapper::topicRequestDtoToTopic)
                .toList();

        // Step 3: Check which topics already exist
        List<String> topicNames = topics.stream()
                .map(Topic::getTopic)
                .toList();

        List<Topic> existingTopics = topicRepository.findByTopicIn(topicNames);
        Set<String> existingTopicNames = existingTopics.stream()
                .map(Topic::getTopic)
                .collect(Collectors.toSet());

        // Step 4: Filter and save only new topics
        List<Topic> newTopics = topics.stream()
                .filter(topic -> !existingTopicNames.contains(topic.getTopic()))
                .toList();

        List<Topic> storedNewTopics = topicRepository.saveAll(newTopics);

        // Step 5: Combine all topics (existing + new)
        List<Topic> finalTopics = new ArrayList<>();
        finalTopics.addAll(existingTopics);
        finalTopics.addAll(storedNewTopics);

        // Step 6: Convert topics to response DTOs
        List<TopicResponseDTO> topicResponseDTOs = finalTopics.stream()
                .map(QuestionMapper::toTopicResponseDto)
                .toList();

        // Step 7: Save question with all related topics
        Question storedQuestion = questionRepository.save(
                QuestionMapper.toEntity(questionRequestDTO, finalTopics)
        );

        UUID questionId = storedQuestion.getId();

        // Step 8: Store test cases via gRPC
        TestCasesDto testCasesDto = csvFileParser.parseCsv(questionId, file);
        TestCasesDto storedTestCases = testCaseServiceImpl.storeTestCases(testCasesDto);


        // Step 9: Build and return response
        return QuestionResponseDTO.builder()
                .id(questionId)
                .title(storedQuestion.getTitle())
                .description(storedQuestion.getDescription())
                .constraints(storedQuestion.getConstraints())
                .difficulty(storedQuestion.getDifficulty())
                .createdAt(storedQuestion.getCreatedAt())
                .updatedAt(storedQuestion.getUpdatedAt())
                .topics(topicResponseDTOs)
                .testcases(storedTestCases)
                .build();
    }
    
    public List<QuestionResponseDTO> getPaginatedQuestions(int page, int size) {
        Pageable pageable = PageRequest.of(page, size, Sort.by("createdAt").ascending());
        Page<Question> questionPage = questionRepository.findAll(pageable);
        return questionPage.map(QuestionMapper::toResponseDto).toList();
    }

    public TestCasesDto getTestCasesByQuestionId(UUID questionId) {
        return testCaseServiceImpl.getTestCasesByQuestionId(questionId);
    }

    public QuestionResponseDTO getQuestionById(UUID id) {
        Question question = questionRepository.findById(id)
                .orElseThrow(() -> new QuestionNotFoundException("Question not found", new Question()));

        TestCasesDto testCasesDto = getTestCasesByQuestionId(id);

        return QuestionMapper.toTopicResponseDtoWithTestCasesDto(question, testCasesDto);
    }

    public void deleteQuestion(UUID id) {
        questionRepository.deleteById(id);
        testCaseServiceImpl.deleteTestCasesByQuestionId(id);
    }
}
