package io.braxton.topicvoter.controller;

import io.braxton.topicvoter.models.Topic;
import io.braxton.topicvoter.repository.TopicRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TopicController {

    @Autowired
    private TopicRepositoryImpl repo;


    @RequestMapping("/")
    public String index(Model model){ //add <---model model alt enter and stuff
//        Topic first = new Topic(1, "Java Spring", "Not sure how Spring works");
//        Topic second = new Topic(2, "Java Sprin", "Not sure how Spring wor");
//        Topic third = new Topic(3, "Java Spri", "Not sure how Spring wor");
//        ArrayList<Topic> topics = new ArrayList<>();
//        topics.add(first);
//        topics.add(second);
//        topics.add(third);
//        model.addAttribute("topics", topics);

        List<Topic> allTopics = repo.findAll();
        model.addAttribute("topics", allTopics);
        return "index";
    }

    @RequestMapping(value = "/createTopic", method = RequestMethod.POST)
    public String createTopic(@RequestParam("title") String title,
                              @RequestParam("description") String description) {
        repo.add(title, description);
        return "redirect:/";
    }

    @RequestMapping(value = "/deleteTopic", method = RequestMethod.POST)
    public String deleteTopic(@RequestParam("id") long id){
        repo.delete(id);
        return "redirect:/";
    }

}
