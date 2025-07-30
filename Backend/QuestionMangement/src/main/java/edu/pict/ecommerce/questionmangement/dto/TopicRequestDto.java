package edu.pict.ecommerce.questionmangement.dto;

import edu.pict.ecommerce.questionmangement.model.Topic;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TopicRequestDto {
    private String topic;
}
