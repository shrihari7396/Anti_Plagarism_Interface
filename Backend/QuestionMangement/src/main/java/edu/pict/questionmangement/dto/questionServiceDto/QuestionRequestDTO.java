package edu.pict.questionmangement.dto.questionServiceDto;

import edu.pict.questionmangement.dto.textCaseServiceDto.TestCasesDto;
import edu.pict.questionmangement.model.enums.Difficulty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionRequestDTO {
    private String title;
    private String description;
    private String constraints;
    private Difficulty difficulty;
    private List<TopicRequestDto> topics;  // e.g., ["Array", "Backtracking"]
}
