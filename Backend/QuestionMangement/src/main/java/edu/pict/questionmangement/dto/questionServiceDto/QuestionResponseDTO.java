package edu.pict.questionmangement.dto.questionServiceDto;

import edu.pict.questionmangement.dto.textCaseServiceDto.TestCasesDto;
import edu.pict.questionmangement.dto.textCaseServiceDto.TestcaseDto;
import edu.pict.questionmangement.model.enums.Difficulty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class QuestionResponseDTO {
    private UUID id;
    private String title;
    private String description;
    private String constraints;
    private Difficulty difficulty;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private List<TopicResponseDTO> topics;
    private TestCasesDto testcases;
}

