package edu.pict.testCaseService.mapper;

import edu.pict.testCaseService.TestCase;
import edu.pict.testCaseService.TestCases;
import edu.pict.testCaseService.model.TestcaseEntity;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class TestCaseMapper {

    public static TestCase testCaseEntityToTestCase(TestcaseEntity testcaseEntity) {
        return TestCase.newBuilder()
                .setInput(testcaseEntity.getInput())
                .setExpectedOutput(testcaseEntity.getExpectedOutput())
                .build();
    }

    public static TestcaseEntity testCaseToTestcaseEntity(TestCase testCase, UUID testcaseId) {
        return TestcaseEntity.builder()
                .questionId(testcaseId)
                .input(testCase.getInput())
                .expectedOutput(testCase.getExpectedOutput())
                .build();
    }

    public static List<TestcaseEntity> testcasesToTestcaseEntities(TestCases testcases) {
        List<TestCase> testcaseList = testcases.getTestcasesList();
        UUID questionId = UUID.fromString(testcases.getQuestionId());
        return testcaseList.parallelStream()
                .map(testCase -> testCaseToTestcaseEntity(testCase, questionId))
                .collect(Collectors.toList());
    }
}
