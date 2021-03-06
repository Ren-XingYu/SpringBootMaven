package io.xy.springboot.topic;

import io.xy.springboot.Topic;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics= Arrays.asList(new Topic("spring","spring framework","spring framework description"),
            new Topic("java","core java","core java description"),
            new Topic("javascript","javascript Framework","javascript framework description"));

    public List<Topic> getAllTopics(){
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic){
        topics.add(topic);
    }
}
