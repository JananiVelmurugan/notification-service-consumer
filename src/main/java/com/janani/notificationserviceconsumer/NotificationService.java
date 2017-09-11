package com.janani.notificationserviceconsumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {

	@RabbitListener(queues = "${jsa.rabbitmq.queue}")
	public void recievedOrder(Order order) {
		System.out.println("Listener is called");
		System.out.println("Recieved Order: " + order);
	}
}