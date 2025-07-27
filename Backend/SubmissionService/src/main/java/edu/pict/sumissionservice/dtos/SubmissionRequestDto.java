package edu.pict.sumissionservice.dtos;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SubmissionRequestDto {
    private String username;
    private String sourceCode;
    private int languageId;
    private String compilerOption;
    private String stdin;
    private String stdout;
    private Boolean base64Encoded;
}
