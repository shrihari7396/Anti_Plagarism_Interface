package edu.pict.JudgeGrpcWrapper.mapper;

import edu.pict.JudgeGrpcWrapper.dots.ExecutionResultDto;
import edu.pict.JudgeGrpcWrapper.dots.RequestDto;
import edu.pict.grpc.submission.SubmissionRequest;

import java.util.Map;

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

    @SuppressWarnings("unchecked")
    public static ExecutionResultDto mapToExecutionResultDto(Map<String, Object> resultMap) {
        if (resultMap == null || resultMap.isEmpty()) return null;

        Map<String, Object> statusMap = (Map<String, Object>) resultMap.get("status");

        ExecutionResultDto.Status status = ExecutionResultDto.Status.builder()
                .id((Integer) statusMap.get("id"))
                .description((String) statusMap.get("description"))
                .build();

        return ExecutionResultDto.builder()
                .stdout((String) resultMap.get("stdout"))
                .time((String) resultMap.get("time"))
                .memory((String) resultMap.get("memory"))
                .stderr((String) resultMap.get("stderr"))
                .token((String) resultMap.get("token"))
                .compile_output((String) resultMap.get("compile_output"))
                .message((String) resultMap.get("message"))
                .status(status)
                .build();
    }
}
