package be.pxl.services.controller;

import be.pxl.services.service.QueueService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(":api/messaging")
@RequiredArgsConstructor
public class messagingController {

    private static final Logger log = LoggerFactory.getLogger(messagingController.class);
    private final RabbitTemplate rabbitTemplate;
    private final QueueService queueService ;

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void sendMessage() {
        rabbitTemplate.convertAndSend("myQueue", "Hello world !");
    }

}
