package edu.pict.sumissionservice.service;

import edu.pict.SubmissionRequest;
import edu.pict.SubmissionResponseToken;
import edu.pict.SubmissionServiceGrpc;
import edu.pict.sumissionservice.dtos.SubmissionRequestDto;
import edu.pict.sumissionservice.dtos.SubmissionResponseDto;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class SubmissionService {

    @GrpcClient("codeSubmission")
    private SubmissionServiceGrpc.SubmissionServiceBlockingStub serviceBlockingStub;

    public SubmissionResponseDto submitCode(SubmissionRequestDto submissionRequestDto) {
        SubmissionRequest request = SubmissionRequest.newBuilder()
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
        SubmissionResponseToken token = serviceBlockingStub.submitRequest(request);
        return SubmissionResponseDto.builder().token(token.getToken()).build();
    }

}
