package edu.pict.JudgeGrpcWrapper.dots;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class RequestDto {
    private String sourceCode;
    private int languageId;
    private String compilerOptions;
    private String commandLineArguments;
    private String stdin;
    private String expectedOutput;
    private float cpuTimeLimit;
    private float cpuExtraTime;
    private float wallTimeLimit;
    private float memoryLimit;
    private int stackLimit;
    private int maxProcessesAndOrThreads;
    private boolean enablePerProcessAndThreadTimeLimit;
    private boolean enablePerProcessAndThreadMemoryLimit;
    private int maxFileSize;
    private boolean redirectStderrToStdout;
    private boolean enableNetwork;
    private int numberOfRuns;
    private String additionalFiles;
    private String callbackUrl;
}
