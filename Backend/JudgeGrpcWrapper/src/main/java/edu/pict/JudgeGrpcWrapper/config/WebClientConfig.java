package edu.pict.JudgeGrpcWrapper.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
    @Value("${base.url}")
    private String baseUrl;

    @Bean
    public WebClient webClientBean() {
        return WebClient.builder()
                .baseUrl(baseUrl) // Replace with your actual base URL if different
                .build();
    }
}
