package com.michellehlcn.orders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BotApplication {

    public static void main(String[] args) {
        SpringApplication.run(BotApplication.class, args);
    }
}
// SymphonyBdk bdk = new SymphonyBdk(loadFromFile("application.yaml"));