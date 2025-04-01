package com.codewithty.springudemy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringUdemyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringUdemyApplication.class, args);
    }
@Bean
    public CommandLineRunner commandLineRunner () {
        return runner->{
            System.out.println("Hello Rumanzi, i swear you got me on this");
        };
}
}
