package edu.pict.questionmangement.dto.textCaseServiceDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;


// This is for Multiple testCases
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TestCasesDto {
    private UUID questionId;
    private List<TestcaseDto> testcases;
}
