package de.woock.service;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import de.woock.entity.EnergyMessage;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor
@Component
public class MessageSender {
	
	
	JmsTemplate jmsTemplate;

	public void sendMessage(EnergyMessage message) {
		log.debug("Sending an energy message.");
		jmsTemplate.convertAndSend("Energy-Support Message", message);
	}
}
