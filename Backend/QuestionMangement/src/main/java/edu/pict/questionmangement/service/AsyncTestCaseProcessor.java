package edu.pict.questionmangement.service;

import edu.pict.questionmangement.dto.textCaseServiceDto.TestCasesDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class AsyncTestCaseProcessor {

    private final CSVFileParser csvFileParser;
    private final TestCaseServiceImpl testCaseServiceImpl;

    @Async
    public void process(UUID questionId, MultipartFile file) {
        try {
            TestCasesDto dto = csvFileParser.parseCsv(questionId, file);
            testCaseServiceImpl.storeTestCases(dto);
        } catch (Exception e) {
            log.error("Failed to process test cases for questionId={}", questionId, e);
        }
    }
}
