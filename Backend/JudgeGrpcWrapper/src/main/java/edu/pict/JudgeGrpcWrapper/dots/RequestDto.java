package edu.pict.JudgeGrpcWrapper.dots;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequestDto {
    private String sourceCode;                          // Required
    private int languageId;                             // Required

    private String compilerOptions = null;
    private String commandLineArguments = null;
    private String stdin = null;
    private String expectedOutput = null;

    private float cpuTimeLimit = 2.0f;                  // Default in seconds (tune per config)
    private float cpuExtraTime = 0.5f;                  // Default extra time
    private float wallTimeLimit = 10.0f;                // Max wall-clock time (safe margin)

    private float memoryLimit = 128000f;                // ~128MB (adjust as needed)
    private int stackLimit = 64000;                     // ~64MB stack
    private int maxProcessesAndOrThreads = 60;

    private boolean enablePerProcessAndThreadTimeLimit = false;
    private boolean enablePerProcessAndThreadMemoryLimit = false;

    private int maxFileSize = 1024;                     // 1 MB max file size
    private boolean redirectStderrToStdout = false;
    private boolean enableNetwork = false;

    private int numberOfRuns = 1;
    private String additionalFiles = null;
    private String callbackUrl = null;
}
