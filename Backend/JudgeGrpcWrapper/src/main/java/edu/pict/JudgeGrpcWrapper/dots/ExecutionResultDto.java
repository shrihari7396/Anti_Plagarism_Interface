package edu.pict.JudgeGrpcWrapper.dots;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExecutionResultDto {
    private String stdout;
    private String time;
    private String memory;
    private String stderr;
    private String token;
    private String compile_output;
    private String message;
    private Status status;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Status {
        private int id;
        private String description;

        // Getters and setters
    }
}