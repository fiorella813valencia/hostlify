package com.example.hostlify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class HostlifyApplication {

    public static void main(String[] args) {
        SpringApplication.run(HostlifyApplication.class, args);
    }

}
