package be.pxl.services;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
//@EnableDiscoveryClient
public class MessagingServiceApplication
{
    public static void main( String[] args )
    {
         SpringApplication.run(MessagingServiceApplication.class, args);
    }
}
