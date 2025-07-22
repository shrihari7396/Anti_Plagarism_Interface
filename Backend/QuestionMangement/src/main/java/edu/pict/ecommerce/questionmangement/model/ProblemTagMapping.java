package edu.pict.ecommerce.questionmangement.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "problem_tag_mappings")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@IdClass(ProblemTagMapping.ProblemTagMappingId.class)
public class ProblemTagMapping {

    @Id
    @Column(name = "problem_id")
    private UUID problemId;

    @Id
    @Column(name = "tag_id")
    private UUID tagId;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ProblemTagMappingId implements Serializable {
        private UUID problemId;
        private UUID tagId;
    }
}

