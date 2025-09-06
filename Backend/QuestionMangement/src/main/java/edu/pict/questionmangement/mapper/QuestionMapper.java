package edu.pict.questionmangement.mapper;

import edu.pict.questionmangement.dto.questionServiceDto.QuestionRequestDTO;
import edu.pict.questionmangement.dto.questionServiceDto.QuestionResponseDTO;
import edu.pict.questionmangement.dto.questionServiceDto.TopicRequestDto;
import edu.pict.questionmangement.dto.questionServiceDto.TopicResponseDTO;
import edu.pict.questionmangement.dto.textCaseServiceDto.TestCasesDto;
import edu.pict.questionmangement.model.Question;
import edu.pict.questionmangement.model.Topic;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class QuestionMapper {

    // Convert Question entity to Response DTO
    public static QuestionResponseDTO toResponseDto(Question question) {
        return QuestionResponseDTO.builder()
                .id(question.getId())
                .title(question.getTitle())
                .description(question.getDescription())
                .constraints(question.getConstraints())
                .difficulty(question.getDifficulty())
                .createdAt(question.getCreatedAt())
                .updatedAt(question.getUpdatedAt())
                .topics(question.getTopics().stream()
                        .map(QuestionMapper::toTopicResponseDto)
                        .collect(Collectors.toList()))
                .build();
    }

    public static QuestionResponseDTO toTopicResponseDtoWithTestCasesDto(Question question, TestCasesDto testCasesDto) {
        QuestionResponseDTO questionResponseDTO = toResponseDto(question);
        questionResponseDTO.setTestcases(testCasesDto);
        return questionResponseDTO;
    }


    // Convert Request DTO to Question entity
    public static Question toEntity(QuestionRequestDTO dto, List<Topic> topics) {
        return Question.builder()
                .title(dto.getTitle())
                .description(dto.getDescription())
                .constraints(dto.getConstraints())
                .difficulty(dto.getDifficulty())
                .topics(topics)
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();
    }

    public static Topic topicResponseDtoToTopic(TopicResponseDTO dto) {
        return Topic.builder()
                .topic(dto.getTopic())
                .build();
    }

    public static Topic topicRequestDtoToTopic(TopicRequestDto dto) {
        return Topic.builder()
                .topic(dto.getTopic())
                .build();
    }

    // Convert Topic entity to TopicResponseDTO
    public static TopicResponseDTO toTopicResponseDto(Topic topic) {
        TopicResponseDTO dto = new TopicResponseDTO();
        dto.setId(topic.getId());
        dto.setTopic(topic.getTopic());
        return dto;
    }
}
