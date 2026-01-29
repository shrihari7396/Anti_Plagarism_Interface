package edu.pict.questionmangement.service;

import edu.pict.questionmangement.dto.questionServiceDto.TopicRequestDto;
import edu.pict.questionmangement.model.Topic;
import edu.pict.questionmangement.repository.TopicRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@RequiredArgsConstructor
public class TopicService {

    private final TopicRepository topicRepository;

    @Transactional
    public List<Topic> getOrCreateTopics(List<TopicRequestDto> topicDtos) {

        Set<String> topicNames = new HashSet<>();
        for (TopicRequestDto dto : topicDtos) {
            topicNames.add(dto.getTopic().trim().toLowerCase());
        }

        List<Topic> existingTopics = topicRepository.findByTopicIn(topicNames);

        Map<String, Topic> topicMap = new HashMap<>();
        for (Topic topic : existingTopics) {
            topicMap.put(topic.getTopic(), topic);
        }

        List<Topic> newTopics = new ArrayList<>();
        for (String name : topicNames) {
            if (!topicMap.containsKey(name)) {
                Topic topic = new Topic();
                topic.setTopic(name);
                newTopics.add(topic);
                topicMap.put(name, topic);
            }
        }

        if (!newTopics.isEmpty()) {
            topicRepository.saveAll(newTopics);
        }

        return new ArrayList<>(topicMap.values());
    }
}
