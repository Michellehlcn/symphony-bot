package com.michellehlcn.orders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BotApplication {

    public static void main(String[] args) {
        SpringApplication.run(BotApplication.class, args);
        
        for(int i =0; i < 5; i++) {
            System.out.println("It's so freaking cold outside!");
        }

        String[] colors = {"Red", "Blue", "Green"};

        for (int i = 0; i < 3; i++) {
            System.out.println(colors[i]);
        }
    }
}
