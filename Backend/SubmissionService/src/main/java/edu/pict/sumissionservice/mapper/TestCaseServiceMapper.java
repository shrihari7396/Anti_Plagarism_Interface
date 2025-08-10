package edu.pict.sumissionservice.mapper;

import edu.pict.grpc.testcase.TestCase;
import edu.pict.sumissionservice.dtos.TestCaseDto;

public class TestCaseServiceMapper {
    public static TestCaseDto testCaseResponseToTestCaseDto(TestCase testCase) {
        return TestCaseDto.builder()
                .input(testCase.getInput())
                .expected(testCase.getExpectedOutput())
                .build();
    }
}
