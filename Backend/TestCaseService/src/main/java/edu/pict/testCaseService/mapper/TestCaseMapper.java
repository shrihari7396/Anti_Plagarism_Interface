package edu.pict.testCaseService.mapper;

import edu.pict.TestCase;
import edu.pict.testCaseService.model.TestcaseEntity;

import java.util.UUID;

public class TestCaseMapper {

    public static TestCase testCaseEntityToTestCase(TestcaseEntity testcaseEntity) {
        return TestCase.newBuilder()
                .setInput(testcaseEntity.getInput())
                .setExpectedOutput(testcaseEntity.getExpectedOutput())
                .build();
    }

    public static TestcaseEntity testCaseToTestcaseEntity(TestCase testCase) {
        return TestcaseEntity.builder()
                .input(testCase.getInput())
                .expectedOutput(testCase.getExpectedOutput())
                .questionId(UUID.fromString(testCase.getQuestionId()))
                .build();
    }

}
