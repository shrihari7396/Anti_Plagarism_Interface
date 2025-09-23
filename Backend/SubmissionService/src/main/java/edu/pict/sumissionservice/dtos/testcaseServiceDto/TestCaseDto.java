package edu.pict.sumissionservice.dtos.testcaseServiceDto;

import lombok.*;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
//@NoArgsConstructor
@Builder
public class TestCaseDto {
    private String input;
    private String expected;
}
