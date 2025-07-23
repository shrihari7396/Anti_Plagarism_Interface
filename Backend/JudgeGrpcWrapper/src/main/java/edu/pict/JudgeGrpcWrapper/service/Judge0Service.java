package edu.pict.JudgeGrpcWrapper.service;

import edu.pict.JudgeGrpcWrapper.dots.RequestDto;
import edu.pict.JudgeGrpcWrapper.mapper.Mapper;
import edu.pict.SubmissionRequest;
import edu.pict.SubmissionResponseToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Map;

@Service
public class Judge0Service {

    @Autowired
    private WebClient webClient;


    // This returns raw map of the response (for debugging)
    public Map<String, Object> submitRequest(SubmissionRequest submissionRequest) {
        RequestDto requestDto = Mapper.submissionRequestToRequestDto(submissionRequest);

        return webClient.post()
                .uri("/submissions/?base64_encoded=false&wait=false")
                .header("Accept", "application/json;charset=utf-8")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .bodyValue(requestDto)
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<Map<String, Object>>() {})
                .block();
    }

}

