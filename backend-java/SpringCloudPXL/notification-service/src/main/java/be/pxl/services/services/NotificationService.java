package be.pxl.services.services;

import be.pxl.services.domain.Notification;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j // Used for logs
public class NotificationService {

public void sendMessage(Notification notification) {
    log.info("Receiving notification...");
    log.info("Sending... {}", notification.getMessage());
    log.info("TO {}", notification.getSender());
}
}
