package edu.pict.questionmangement.service;

import edu.pict.questionmangement.dto.textCaseServiceDto.TestCasesDto;
import edu.pict.questionmangement.dto.textCaseServiceDto.TestcaseDto;

import lombok.extern.slf4j.Slf4j;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
@Slf4j
public class CSVFileParser {

    public TestCasesDto parseCsv(UUID questionId, MultipartFile file) {
        List<TestcaseDto> testcases = new ArrayList<>();

        try (
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(file.getInputStream(), StandardCharsets.UTF_8));
                CSVParser csvParser = new CSVParser(reader,
                        CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim())
        ) {
            for (CSVRecord record : csvParser) {
                TestcaseDto dto = new TestcaseDto();
                dto.setInput(record.get("input"));
                dto.setExpectedOutput(record.get("expectedOutput"));
                dto.setHidden(Boolean.parseBoolean(record.get("hidden")));
                testcases.add(dto);
            }
        } catch (Exception e) {
            log.error("Error parsing CSV file: {}", e.getMessage(), e);
            throw new RuntimeException("Invalid CSV file format. Please check headers: input, expectedOutput, hidden", e);
        }

        return TestCasesDto.builder()
                .questionId(questionId)
                .testcases(testcases)
                .build();
    }
}
