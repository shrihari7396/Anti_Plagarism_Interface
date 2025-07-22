package edu.pict.ecommerce.questionmangement.model;

import edu.pict.ecommerce.questionmangement.model.enums.Difficulty;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "problems")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Problem {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private String title;

    @Lob
    @Column(nullable = false)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Difficulty difficulty;

    @Lob
    private String constraints;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

//    @Column(name = "is_premium", nullable = false)
//    private boolean isPremium;

    @Column(name = "acceptance_rate")
    private float acceptanceRate;

    @Column(name = "submission_count")
    private int submissionCount;

    @Column(name = "accepted_count")
    private int acceptedCount;
}

