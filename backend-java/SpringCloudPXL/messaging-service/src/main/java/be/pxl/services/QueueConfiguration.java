package be.pxl.services;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// TODO : Vraag - is de import correct? Er zijn er verschillende.. (util,..)

@Configuration
public class QueueConfiguration {

    @Bean
    public Queue myQueue() {

        return new Queue("myQueue", false);

    }

}
