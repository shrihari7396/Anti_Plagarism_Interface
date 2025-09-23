package edu.pict.sumissionservice.controller;

import edu.pict.sumissionservice.dtos.submissionDto.ExecutionResultDto;
import edu.pict.sumissionservice.dtos.submissionDto.SubmissionRequestDto;
import edu.pict.sumissionservice.dtos.submissionDto.SubmissionResponseDto;
import edu.pict.sumissionservice.service.SubmissionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

@Slf4j
@RestController
@RequestMapping("/submission")
public class SubmissionController {

    @Autowired
    private SubmissionService submissionService;

    @PostMapping("/submit")
    public CompletableFuture<SubmissionResponseDto> submit(@RequestBody SubmissionRequestDto submissionRequestDto) {
        log.info("submissionRequestDto={}, from submit", submissionRequestDto);
        return submissionService.runCode(submissionRequestDto);
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/{token}")
    public ExecutionResultDto getSubmission(@PathVariable("token") String token) {
        log.info("token={} from getSubmission", token);
        SubmissionResponseDto dto = SubmissionResponseDto.builder()
                .token(token).build();
        return submissionService.getResponseUsingToken(dto);
    }

    @PostMapping("/instantExecution")
    public ExecutionResultDto getInstantSubmission(@RequestBody SubmissionRequestDto submissionRequestDto) {
        log.info("submissionRequestDto={}, from getInstantSubmission", submissionRequestDto);
        return submissionService.instantExecutionResult(submissionRequestDto);
    }

}


