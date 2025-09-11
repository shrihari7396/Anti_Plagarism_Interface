package edu.pict.JudgeGrpcWrapper.models;

import edu.pict.JudgeGrpcWrapper.models.enums.Language;
import edu.pict.JudgeGrpcWrapper.models.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "submissions")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Submission {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "user_id", nullable = false)
    private String username;

    @Column(name = "problem_id", nullable = false)
    private Integer problemId;

    @Lob
    @Column(nullable = false)
    private String code;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Language language;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    @Column(nullable = true)
    private Integer runtime; // in milliseconds

    @Column(nullable = true)
    private Integer memory; // in MB

    @Column(name = "submitted_at", nullable = false)
    private LocalDateTime submittedAt;

    @Column(name = "test_cases_passed", nullable = false)
    private Integer testCasesPassed;

    @Column(name = "total_test_cases", nullable = false)
    private Integer totalTestCases;
}
