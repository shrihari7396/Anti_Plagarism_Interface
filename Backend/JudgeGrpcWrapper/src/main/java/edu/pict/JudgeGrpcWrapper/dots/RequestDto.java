package edu.pict.JudgeGrpcWrapper.dots;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class RequestDto {
    private String sourceCode;
    private Integer languageId;
    private String compilerOptions;
    private String commandLineArguments;
    private String stdin;
    private String expectedOutput;
    private Float cpuTimeLimit;
    private Float cpuExtraTime;
    private Float wallTimeLimit;
    private Float memoryLimit;
    private Integer stackLimit;
    private Integer maxProcessesAndOrThreads;
    private Boolean enablePerProcessAndThreadTimeLimit;
    private Boolean enablePerProcessAndThreadMemoryLimit;
    private Integer maxFileSize;
    private Boolean redirectStderrToStdout;
    private Boolean enableNetwork;
    private Integer numberOfRuns;
    private String additionalFiles; // base64 encoded .zip
    private String callbackUrl;
}
