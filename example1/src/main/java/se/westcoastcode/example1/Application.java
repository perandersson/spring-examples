package se.westcoastcode.example1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The @SpringBootApplication annotation is scanned for by Spring Boot's build plugin.
 * It configures the jar file so that java knows that this class contains the starting point
 * of your application
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        // Let spring boot take over the execution
        SpringApplication.run(Example1Application.class, args);
    }
}
