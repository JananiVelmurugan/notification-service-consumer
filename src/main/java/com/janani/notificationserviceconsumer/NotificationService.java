package com.janani.notificationserviceconsumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {

	@RabbitListener(queues = "${jsa.rabbitmq.queue}")
	public void recievedOrder(String msg) {
		System.out.println("Recieved Order: " + msg);
	}
}