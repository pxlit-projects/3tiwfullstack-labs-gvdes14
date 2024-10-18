package be.pxl.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * ConfigServiceApplication
 *
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServiceApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(ConfigServiceApplication.class, args);
        // TODO : Change the config to a GIT profile. This is better for handling the config...
    }
}
