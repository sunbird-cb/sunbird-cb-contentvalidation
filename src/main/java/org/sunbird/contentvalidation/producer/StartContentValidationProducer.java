package org.sunbird.contentvalidation.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class StartContentValidationProducer {

	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;

	public void push(String topic, Object value) {
		ObjectMapper mapper = new ObjectMapper();
		String message = null;
		try {
			message = mapper.writeValueAsString(value);
			kafkaTemplate.send(topic, message);
		} catch (JsonProcessingException e) {
			log.error("Exception while serializing the value", e);
		}
	}
}
