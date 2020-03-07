package de.woock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@EnableJms
@SpringBootApplication
public class EnergySupportSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnergySupportSystemApplication.class, args);
	}

}
