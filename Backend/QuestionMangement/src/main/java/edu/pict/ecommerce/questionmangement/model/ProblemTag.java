package edu.pict.ecommerce.questionmangement.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@Entity
@Table(name = "problem_tags")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProblemTag {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(unique = true, nullable = false)
    private String name;
}

