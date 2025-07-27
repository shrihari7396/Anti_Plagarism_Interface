package edu.pict.sumissionservice.controller;

import edu.pict.SubmissionResponseToken;
import edu.pict.sumissionservice.dtos.SubmissionRequestDto;
import edu.pict.sumissionservice.dtos.SubmissionResponseDto;
import edu.pict.sumissionservice.service.SubmissionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/submission")
@Slf4j
public class SubmissionController {

    @Autowired
    private SubmissionService submissionService;

    @PostMapping("/submit")
    public SubmissionResponseDto submit(@RequestBody SubmissionRequestDto submissionRequestDto) {
        log.info("submissionRequestDto={}", submissionRequestDto);
        return submissionService.submitCode(submissionRequestDto);
    }

}
