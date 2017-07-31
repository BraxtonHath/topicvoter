package io.braxton.topicvoter.controller;

import io.braxton.topicvoter.models.Topic;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class TopicController {
    @RequestMapping("/")
    public String index(Model model){ //add <---model model alt enter and stuff
        Topic first = new Topic(1, "Java Spring", "Not sure how Spring works");
        Topic second = new Topic(2, "Java Sprin", "Not sure how Spring wor");
        Topic third = new Topic(3, "Java Spri", "Not sure how Spring wor");
        ArrayList<Topic> topics = new ArrayList<>();
        topics.add(first);
        topics.add(second);
        topics.add(third);
        model.addAttribute("topics", topics);

        return "index";
    }
}
