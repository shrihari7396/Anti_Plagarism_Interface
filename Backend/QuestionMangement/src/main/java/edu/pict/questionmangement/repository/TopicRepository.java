package edu.pict.questionmangement.repository;

import edu.pict.questionmangement.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Long> {
    Optional<Topic> findByTopic(String topic);
//    List<Topic> saveAllIfNotExist(List<Topic> topics);
    boolean existsByTopic(String topic);

    List<Topic> findByTopicIn(List<String> topicNames);
}
