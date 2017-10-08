package io.javabrains.bootstarter.topic;

import java.util.Arrays;
import java.util.List;


import org.springframework.stereotype.Service;

@Service
public class TopicService {

		private List<Topic> topics = Arrays.asList(
				new Topic("1", "mahesh new", "test 1"),
				new Topic("2", "suresh test", "test 2"),
				new Topic("3", "rajesh", "test 3")
		);	
		
		public List<Topic> getAllTopics() {
			
				return topics;
		}
		
		public Topic getTopic(String id) {
			
			return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		}
		
		public void addTopic(Topic topic) {
			
			topics.add(topic);
		}
		
}
