package edu.pict.sumissionservice.dtos.submissionDto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SubmissionRequestDto {
    private String username;
    private UUID questionId;

    private String sourceCode;
    private int languageId;
    private String compilerOption;
    private String stdin;
    private String stdout;
    private String expectedOutput;
    private Boolean base64Encoded;
}
