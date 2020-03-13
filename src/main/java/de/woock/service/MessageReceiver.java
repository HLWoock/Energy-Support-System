package de.woock.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import de.woock.entity.EnergyMessage;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class MessageReceiver {

	@JmsListener(destination = "Energy-Support-Message", containerFactory = "myFactory")
	public void receiveMessage(EnergyMessage message) {
		log.debug("Received <" + message.getMessage() + ">"); //
	}
}
