package edu.pict.ecommerce.questionmangement.mapper;

import edu.pict.ecommerce.questionmangement.dto.QuestionRequestDTO;
import edu.pict.ecommerce.questionmangement.dto.QuestionResponseDTO;
import edu.pict.ecommerce.questionmangement.dto.TopicResponseDTO;
import edu.pict.ecommerce.questionmangement.model.Question;
import edu.pict.ecommerce.questionmangement.model.Topic;

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


    // Convert Request DTO to Question entity
    public static Question toEntity(QuestionRequestDTO dto, List<Topic> topicEntities) {
        return Question.builder()
                .title(dto.getTitle())
                .description(dto.getDescription())
                .constraints(dto.getConstraints())
                .difficulty(dto.getDifficulty())
                .topics(topicEntities)
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();
    }

    // Convert Topic entity to TopicResponseDTO
    public static TopicResponseDTO toTopicResponseDto(Topic topic) {
        TopicResponseDTO dto = new TopicResponseDTO();
        dto.setId(topic.getId());
        dto.setName(topic.getName());
        return dto;
    }
}
