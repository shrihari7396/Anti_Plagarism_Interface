package edu.pict.questionmangement.mapper;

import edu.pict.TestCase;
import edu.pict.TestCaseResponse;
import edu.pict.questionmangement.dto.TestCasesDto;
import edu.pict.questionmangement.dto.TestcaseDto;

import java.util.List;
import java.util.UUID;

public class TestCaseMapper {

    public static TestcaseDto testCaseToTestcaseDto(TestCase testcase) {
        return TestcaseDto.builder()
                .input(testcase.getInput())
                .expectedOutput(testcase.getExpectedOutput())
                .hidden(testcase.getHidden())
                .questionId(UUID.fromString(testcase.getQuestionId()))
                .build();
    }

    public static TestCase testCaseDtoToTestcase(TestcaseDto testcaseDto) {
        return TestCase.newBuilder()
                .setQuestionId(testcaseDto.getQuestionId().toString())
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
