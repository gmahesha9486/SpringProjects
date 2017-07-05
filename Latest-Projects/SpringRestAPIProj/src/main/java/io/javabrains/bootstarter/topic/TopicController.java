package io.javabrains.bootstarter.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TopicController {

		@Autowired
		private TopicService topicService;
		
		@RequestMapping("/topics/")
		public List<Topic> getAllTopics() {
			 
			return topicService.getAllTopics();
			
		}
		
		@RequestMapping("/topics/{userid}")
		public Topic getTopic(@PathVariable("userid") String id) {
			 
				return topicService.getTopic(id);
		}
		
		@RequestMapping(method=RequestMethod.POST, value="/topic")
		public void addTopic(@RequestBody Topic topic) {
			
			
			
		}
		
}
