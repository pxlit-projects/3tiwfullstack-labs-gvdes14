package be.pxl.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private static final Logger log = LoggerFactory.getLogger(ConfigServiceApplication.class);

    public static void main( String[] args )
    {
        SpringApplication.run(ConfigServiceApplication.class, args);

        // TODO : Change the config to a GIT profile. This is better for handling the config...
        // TODO : Vraag - Dan wordt enkel de config van de config server bijgehouden op git? Hoe wordt dan hiermee onderscheid gemaakt tussen de verschillende omgevingen? dev, prod,...

    }
}
