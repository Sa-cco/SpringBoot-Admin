package com.example.demoamind;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableAdminServer
@SpringBootApplication
public class DemoamindApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoamindApplication.class, args);
    }

}
