package edu.pict.questionmangement.mapper;

import edu.pict.testCaseService.TestCase;
import edu.pict.testCaseService.TestCaseResponse;
import edu.pict.questionmangement.dto.textCaseServiceDto.TestCasesDto;
import edu.pict.questionmangement.dto.textCaseServiceDto.TestcaseDto;

import java.util.List;

public class TestCaseMapper {

    public static TestcaseDto testCaseToTestcaseDto(TestCase testcase) {
        return TestcaseDto.builder()
                .input(testcase.getInput())
                .expectedOutput(testcase.getExpectedOutput())
                .hidden(testcase.getHidden())
                .build();
    }

    public static TestCase testCaseDtoToTestcase(TestcaseDto testcaseDto) {
        return TestCase.newBuilder()
                .setInput(testcaseDto.getInput())
                .setExpectedOutput(testcaseDto.getExpectedOutput())
                .setHidden(testcaseDto.isHidden())
                .build();
    }

    public static TestCasesDto TestCaseResponseToTestCasesResponseDto (TestCaseResponse testCaseResponse) {
        List<TestcaseDto> testcases = testCaseResponse.getTestcasesList().stream().map(TestCaseMapper::testCaseToTestcaseDto).toList();
        return TestCasesDto.builder()
                .testcases(testcases)
                .build();
    }
}
