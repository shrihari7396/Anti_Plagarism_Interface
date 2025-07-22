package edu.pict.JudgeGrpcWrapper.service;

import edu.pict.JudgeGrpcWrapper.dots.RequestDto;
import edu.pict.JudgeGrpcWrapper.mapper.Mapper;
import edu.pict.SubmissionRequest;
import edu.pict.SubmissionResponseToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class Judge0Service {

    @Autowired
    private WebClient webClient;

    public SubmissionResponseToken submitRequest(SubmissionRequest submissionRequest) {
        RequestDto requestDto = Mapper.submissionRequestToRequestDto(submissionRequest);

        return webClient.post()
                .uri("/submissions/?base64_encoded=false&wait=false")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .bodyValue(requestDto)
                .retrieve()
                .bodyToMono(SubmissionResponseToken.class)
                .block();
                // Blocks and returns the actual SubmissionResponseToken
    }
}

