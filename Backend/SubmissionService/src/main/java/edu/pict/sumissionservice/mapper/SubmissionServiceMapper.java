package edu.pict.sumissionservice.mapper;

import edu.pict.grpc.submission.ExecutionResult;
import edu.pict.grpc.submission.SubmissionRequest;
import edu.pict.grpc.submission.SubmissionResponseToken;
import edu.pict.sumissionservice.dtos.submissionDto.ExecutionResultDto;
import edu.pict.sumissionservice.dtos.submissionDto.SubmissionRequestDto;
import edu.pict.sumissionservice.dtos.submissionDto.SubmissionResponseDto;

public class SubmissionServiceMapper {

    // Below two function is for handline queue Submission
    public static SubmissionRequest submissionRequestDtoToSubmissionRequest(SubmissionRequestDto submissionRequestDto) {
        return SubmissionRequest.newBuilder()
                .setSourceCode(submissionRequestDto.getSourceCode())
                .setLanguageId(submissionRequestDto.getLanguageId())
                .setCompilerOptions(submissionRequestDto.getCompilerOption() != null ? submissionRequestDto.getCompilerOption() : "")
                .setCommandLineArguments("")
                .setStdin(submissionRequestDto.getStdin() != null ? submissionRequestDto.getStdin() : "")
                .setExpectedOutput(submissionRequestDto.getExpectedOutput() != null ? submissionRequestDto.getExpectedOutput() : "")
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
                .setQuestionId(submissionRequestDto.getQuestionId().toString())
                .setUsername(submissionRequestDto.getUsername())
                .build();
    }

    public static SubmissionResponseToken submissionResponseDtoToSubmissionResponseToken(SubmissionResponseDto submissionResponseDto) {
        return SubmissionResponseToken.newBuilder()
                .setToken(submissionResponseDto.getToken())
                .setQuestionId(submissionResponseDto.getQuestionId())
                .setUsername(submissionResponseDto.getUsername())
                .build();
    }

    // This is for Instant execution
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

}
