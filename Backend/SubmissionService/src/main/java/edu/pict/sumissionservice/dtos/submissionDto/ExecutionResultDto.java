package edu.pict.sumissionservice.dtos.submissionDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExecutionResultDto {
    public String stdout;
    public String time;
    public String memory;
    public String stderr;
    public String token;
    public String compile_output;
    public String message;
    public Status status;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Status {
        public int id;
        public String description;
    }
}
