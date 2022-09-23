package com.app.atlas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class AtlasApplication {

    public static void main(String[] args) {
        SpringApplication.run(AtlasApplication.class, args);
    }

}
