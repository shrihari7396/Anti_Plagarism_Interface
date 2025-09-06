package edu.pict.questionmangement.dto.textCaseServiceDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// This is for one testCase
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TestcaseDto {
    private String input;
    private String expectedOutput;
    private boolean hidden;
}
