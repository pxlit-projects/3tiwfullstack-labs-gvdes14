package be.pxl.services.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/notification")
public class NotificationController {

    //TODO : Write the required api endpoints

    @GetMapping
    public ResponseEntity<String> getNotification() {
        return ResponseEntity.ok("Hello World");
    }

}
