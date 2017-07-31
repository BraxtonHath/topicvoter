package io.braxton.topicvoter.interfaces;

import io.braxton.topicvoter.models.Topic;
import java.util.List;

public interface TopicRepository {
    List<Topic> findAll();
}
