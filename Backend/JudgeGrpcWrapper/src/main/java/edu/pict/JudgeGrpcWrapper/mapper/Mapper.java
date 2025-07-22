package edu.pict.JudgeGrpcWrapper.mapper;

import edu.pict.JudgeGrpcWrapper.dots.RequestDto;
import edu.pict.SubmissionRequest;

public class Mapper {

    public static RequestDto submissionRequestToRequestDto(SubmissionRequest submissionRequest) {
        return RequestDto.builder()
                .sourceCode(submissionRequest.getSourceCode())
                .languageId(submissionRequest.getLanguageId())
                .compilerOptions(submissionRequest.getCompilerOptions())
                .commandLineArguments(submissionRequest.getCommandLineArguments())
                .stdin(submissionRequest.getStdin())
                .expectedOutput(submissionRequest.getExpectedOutput())
                .cpuTimeLimit(submissionRequest.getCpuTimeLimit())
                .cpuExtraTime(submissionRequest.getCpuExtraTime())
                .wallTimeLimit(submissionRequest.getWallTimeLimit())
                .memoryLimit(submissionRequest.getMemoryLimit())
                .stackLimit(submissionRequest.getStackLimit())
                .maxProcessesAndOrThreads(submissionRequest.getMaxProcessesAndOrThreads())
                .enablePerProcessAndThreadTimeLimit(submissionRequest.getEnablePerProcessAndThreadTimeLimit())
                .enablePerProcessAndThreadMemoryLimit(submissionRequest.getEnablePerProcessAndThreadMemoryLimit())
                .maxFileSize(submissionRequest.getMaxFileSize())
                .redirectStderrToStdout(submissionRequest.getRedirectStderrToStdout())
                .enableNetwork(submissionRequest.getEnableNetwork())
                .numberOfRuns(submissionRequest.getNumberOfRuns())
                .additionalFiles(submissionRequest.getAdditionalFiles())
                .callbackUrl(submissionRequest.getCallbackUrl())
                .build();
    }
}
