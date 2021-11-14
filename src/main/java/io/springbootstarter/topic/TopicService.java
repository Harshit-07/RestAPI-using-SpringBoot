package io.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topics> topics = new ArrayList<>(Arrays.asList(
			new Topics("spring","Spring framework","Spring framework Description"),
			new Topics("java","Core java","Core java Description"),
			new Topics("JS","ReactJS","ReactJS framework Description")
			));
	
	public List<Topics> getAllTopics(){
		return topics;
	}
	
	public Topics getTopics(String id) {
		 return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topics topic) {
		topics.add(topic);
	}
}


