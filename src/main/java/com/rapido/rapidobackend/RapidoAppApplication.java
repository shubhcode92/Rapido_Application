package com.rapido.rapidobackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RapidoAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(RapidoAppApplication.class, args);
        System.out.println("HI spring boot");
        System.out.println("second change!");
    }

}
