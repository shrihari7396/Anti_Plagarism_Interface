package edu.pict.sumissionservice.mapper;

import edu.pict.ExecutionResult;
import edu.pict.SubmissionRequest;
import edu.pict.SubmissionResponseToken;
import edu.pict.sumissionservice.dtos.ExecutionResultDto;
import edu.pict.sumissionservice.dtos.SubmissionRequestDto;
import edu.pict.sumissionservice.dtos.SubmissionResponseDto;

public class Mapper {

    public static SubmissionRequest submissionRequestDtoToSubmissionRequest(SubmissionRequestDto submissionRequestDto) {
        return SubmissionRequest.newBuilder()
                .setSourceCode(submissionRequestDto.getSourceCode())
                .setLanguageId(submissionRequestDto.getLanguageId())
                .setCompilerOptions(submissionRequestDto.getCompilerOption() != null ? submissionRequestDto.getCompilerOption() : "")
                .setCommandLineArguments("")
                .setStdin(submissionRequestDto.getStdin() != null ? submissionRequestDto.getStdin() : "")
                .setExpectedOutput(submissionRequestDto.getStdout() != null ? submissionRequestDto.getStdout() : "")
                .setCpuTimeLimit(1.0f)
                .setCpuExtraTime(0.5f)
                .setWallTimeLimit(2.0f)
                .setMemoryLimit(128000) // 128 MB in KB
                .setStackLimit(64000) // 64 MB
                .setMaxProcessesAndOrThreads(60)
                .setEnablePerProcessAndThreadTimeLimit(false)
                .setEnablePerProcessAndThreadMemoryLimit(false)
                .setMaxFileSize(1024)
                .setRedirectStderrToStdout(true)
                .setEnableNetwork(false)
                .setNumberOfRuns(1)
                .setAdditionalFiles("")
                .setCallbackUrl("")
                .setBase64Encoded(submissionRequestDto.getBase64Encoded() != null ? submissionRequestDto.getBase64Encoded() : false)
                .build();
    }

    public static ExecutionResultDto executionResultToExecutionResultDto(ExecutionResult result) {
        ExecutionResultDto.Status statusDto = ExecutionResultDto.Status.builder()
                .id(result.getStatus().getId())
                .description(result.getStatus().getDescription())
                .build();
        return ExecutionResultDto.builder()
                .stdout(result.getStdout())
                .time(result.getTime())
                .memory(result.getMemory())
                .stderr(result.getStderr())
                .token(result.getToken())
                .compile_output(result.getCompileOutput())
                .message(result.getMessage())
                .status(statusDto)
                .build();
    }

    public static SubmissionResponseToken submissionResponseDtoToSubmissionResponseToken(SubmissionResponseDto submissionResponseDto) {
        return SubmissionResponseToken.newBuilder()
                .setToken(submissionResponseDto.getToken())
                .build();
    }

}
