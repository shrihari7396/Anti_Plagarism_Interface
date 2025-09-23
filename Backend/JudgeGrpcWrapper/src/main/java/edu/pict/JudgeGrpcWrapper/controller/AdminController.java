package edu.pict.JudgeGrpcWrapper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/judge0/admin")
public class AdminController {

    @Autowired
    private WebClient webClient;

    @GetMapping("/languages")
    public Mono<String> getLanguages() {
        return webClient.get()
                .uri("/languages")
                .retrieve()
                .bodyToMono(String.class);
    }

    @GetMapping("/status")
    public Mono<String> getStatus() {
        return webClient.get()
                .uri("/")
                .retrieve()
                .bodyToMono(String.class)
                .onErrorReturn("Judge0 service is unreachable");
    }

    @GetMapping("/systemInfo")
    public Mono<String> getSystemInfo() {
        return webClient.get()
                .uri("/system_info")
                .retrieve()
                .bodyToMono(String.class)
                .onErrorReturn("Judge0 service is unreachable");
    }

    @GetMapping("/configInfo")
    public Mono<String> getConfigInfo() {
        return webClient.get()
                .uri("/config_info")
                .retrieve()
                .bodyToMono(String.class)
                .onErrorReturn("Judge0 service is unreachable");
    }

    @GetMapping("/statistics")
    public Mono<String> getStatistics() {
        return webClient.get()
                .uri("/statistics")
                .retrieve()
                .bodyToMono(String.class)
                .onErrorReturn("Judge0 service is unreachable");
    }

    @GetMapping("/worker")
    public Mono<String> getWorker() {
        return webClient.get()
                .uri("/workers")
                .retrieve()
                .bodyToMono(String.class)
                .onErrorReturn("Judge0 service is unreachable");
    }

    @GetMapping("/about")
    public Mono<String> getAbout() {
        return webClient.get()
                .uri("/about")
                .retrieve()
                .bodyToMono(String.class)
                .onErrorReturn("Judge0 service is unreachable");
    }

    @GetMapping("/version")
    public Mono<String> getVersion() {
        return webClient.get()
                .uri("/version")
                .retrieve()
                .bodyToMono(String.class)
                .onErrorReturn("Judge0 service is unreachable");
    }

    @GetMapping("/isolate")
    public Mono<String> getIsolate() {
        return webClient.get()
                .uri("/isolate")
                .retrieve()
                .bodyToMono(String.class)
                .onErrorReturn("Judge0 service is unreachable");
    }

    @GetMapping("/license")
    public Mono<String> getLicense() {
        return webClient.get()
                .uri("/license")
                .retrieve()
                .bodyToMono(String.class)
                .onErrorReturn("Judge0 service is unreachable");
    }

}
