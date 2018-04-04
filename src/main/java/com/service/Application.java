package com.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Follow spring boot conventions during structuring your code:
 * https://docs.spring.io/spring-boot/docs/current/reference/html/using-boot-structuring-your-code.html
 */
@SpringBootApplication
public class Application {

    /**
     * Entry point into the boot application.
     *
     * @param args possible start arguments
     */
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        app.run(args);
    }
}
