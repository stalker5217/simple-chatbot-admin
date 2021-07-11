package com.simplechatbotadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class SimpleChatbotAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleChatbotAdminApplication.class, args);
    }

}
