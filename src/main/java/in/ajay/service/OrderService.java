package in.ajay.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import in.ajay.binding.Order;
import in.ajay.constants.AppConstants;

@Service
public class OrderService {

	@Autowired
	private KafkaTemplate<String, Order> kafkaTemplate;
	
	public String addMsg(Order order) {
		//publish message to kafka topic
		
		kafkaTemplate.send(AppConstants.TOPIC_NAME, order);
		return "Message Published To Kafka Topic";
	}
}
