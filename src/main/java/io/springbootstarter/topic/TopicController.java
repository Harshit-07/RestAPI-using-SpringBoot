package io.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topics> getAllTopics() {
		return Arrays.asList(
				new Topics("spring","Spring framework","Spring framework Description"),
				new Topics("java","Core java","Core java Description"),
				new Topics("JS","ReactJS","ReactJS framework Description")
				);
	} 
}
