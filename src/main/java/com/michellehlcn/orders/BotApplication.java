package com.michellehlcn.orders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BotApplication {

    public static void main(String[] args) {
        SpringApplication.run(BotApplication.class, args);
        
        // Nested LOOP
        for(int i =0; i < 5; i++) {
            System.out.println("It's so freaking cold outside!");
        }
        System.out.println("-------");
        
        String[] colors = {"Red", "Blue", "Green"};
        for (int i = 0; i < 3; i++) {
            System.out.println(colors[i]);
        }
        System.out.println("-------");

        String[][] fancyColors = { {"Red", "Blue", "Green"},
                                    {"Cyan"," Mag", "Tog"}};
        for(int row = 0; row < 2; row++) {
            for(int column = 0; column < 3; column++) {
                System.out.println(fancyColors[row][column]);
            }
        }
        System.out.println("-------");
    }
}
