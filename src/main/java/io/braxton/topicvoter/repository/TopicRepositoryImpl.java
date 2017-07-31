package io.braxton.topicvoter.repository;

import io.braxton.topicvoter.interfaces.TopicRepository;
import io.braxton.topicvoter.models.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TopicRepositoryImpl implements TopicRepository {

    @Autowired
    JdbcTemplate jdcbTemplate;
    


    public List<Topic> findAll() {
        jdcbTemplate.query("SELECT * FROM topic");
        return null;
    }
}
