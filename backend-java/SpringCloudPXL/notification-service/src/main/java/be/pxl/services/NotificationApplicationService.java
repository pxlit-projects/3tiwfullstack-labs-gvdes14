package be.pxl.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * NotificationApplicationService
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NotificationApplicationService
{
    public static void main( String[] args )
    {
        SpringApplication.run(NotificationApplicationService.class, args);
    }
}
