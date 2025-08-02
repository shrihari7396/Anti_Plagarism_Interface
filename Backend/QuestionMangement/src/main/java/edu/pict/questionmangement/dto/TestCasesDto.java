package edu.pict.questionmangement.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


// This is for Multiple testCases
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TestCasesDto {
    List<TestcaseDto> testcases;
}
