package com.douglasdeosouza.fundamentals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//launch class spring boot
@SpringBootApplication
public class FundamentalsApplication {

    public static void main(String[] args) {

        SpringApplication.run(FundamentalsApplication.class, args);
        System.out.println("start spring boot app");

    }

}
