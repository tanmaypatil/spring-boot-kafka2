package com.streaming.payments;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Value("${com.streaming.payments.topic-1}")
	private String topic1;

	@Value("${com.streaming.payments.topic-2}")
	private String topic2;
	
	@Value("${com.streaming.payments.topic-3}")
	private String topic3;
	
	@Value("${com.streaming.payments.topic-4}")
	private String topic4;

	@Bean
	NewTopic topic1() {
		return TopicBuilder.name(topic1).partitions(1).replicas(1).build();
	}

	@Bean
	NewTopic topic2() {
		return TopicBuilder.name(topic2).partitions(1).replicas(1).build();
	}
	
	@Bean
	NewTopic topic3() {
		return TopicBuilder.name(topic3).partitions(1).replicas(1).build();
	}
	
	@Bean
	NewTopic topicUser() {
		return TopicBuilder.name(topic4).partitions(1).replicas(1).build();
	}
	
	@Bean
	NewTopic topicBytes() {
		return TopicBuilder.name("reflectoring-bytes").partitions(1).replicas(1).build();
	}
	
	@Bean
	NewTopic others() {
		return TopicBuilder.name("reflectoring-others").partitions(1).replicas(1).build();
	}
}
