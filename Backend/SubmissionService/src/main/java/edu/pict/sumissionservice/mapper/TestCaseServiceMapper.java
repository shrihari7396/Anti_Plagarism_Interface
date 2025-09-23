package edu.pict.sumissionservice.mapper;

import edu.pict.sumissionservice.dtos.testcaseServiceDto.TestCaseDto;
import edu.pict.testCaseService.TestCase;

public class TestCaseServiceMapper {
    public static TestCaseDto testCaseResponseToTestCaseDto(TestCase testCase) {
        return TestCaseDto.builder()
                .input(testCase.getInput())
                .expected(testCase.getExpectedOutput())
                .build();
    }
}
