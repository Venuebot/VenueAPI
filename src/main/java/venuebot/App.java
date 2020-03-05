package venuebot;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/// This is the main Spring Boot application - converted into web servlet to make it web app deployable
@SpringBootApplication
@EnableSwagger2
@ComponentScan("venuebot")
public class App  {
    static Logger logger = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) throws InterruptedException  {
        ApplicationContext context = SpringApplication.run(App.class, args);
        logger.info("Venuebot Services started "+LocalDateTime.now());
        Thread.sleep(50000);
    }


}
