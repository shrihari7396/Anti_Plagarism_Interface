package edu.pict.ecommerce.questionmangement.model;

import edu.pict.ecommerce.questionmangement.model.enums.Difficulty;
import edu.pict.ecommerce.questionmangement.model.enums.Topics;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Question {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private String title;

    @Lob
    @Column(nullable = false)
    private String description;

    @Lob
    private String constraints;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Difficulty difficulty;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
