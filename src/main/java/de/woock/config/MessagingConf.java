package de.woock.config;

import java.util.Arrays;
import java.util.List;

import javax.jms.ConnectionFactory;
import javax.jms.JMSException;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;

@Configuration
public class MessagingConf {
	@Bean
    public JmsListenerContainerFactory<?> myFactory(ConnectionFactory connectionFactory,
    		                                        DefaultJmsListenerContainerFactoryConfigurer configurer) throws JMSException {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory);
        configurer.configure(factory, connectionFactory);
        
        return factory;
    }
   
    @Bean
    public ConnectionFactory connectionFactory() {
    	ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory("admin", "admin", "tcp://localhost:61616");
    	List<String> trustedPackages = Arrays.asList("de.woock.entity,java.lang".split(","));
    	factory.setTrustedPackages(trustedPackages);
    	return factory;
    }

    @Bean
    public JmsTemplate jmsKundenAufgenommenMeldung(){
        JmsTemplate template = new JmsTemplate();
        template.setConnectionFactory(connectionFactory());
        return template;
    }
}
