package de.woock;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;

import de.woock.entity.EnergyMessage;
import de.woock.service.MessageSender;

@EnableJms
@SpringBootApplication
public class EnergySupportSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnergySupportSystemApplication.class, args);
	}
	
	@Bean
	ApplicationRunner init(MessageSender sender) {
		return args -> {
			sender.sendMessage(new EnergyMessage("Energy up and running"));
		};
	}

}
