package com.example.habits;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HabitsApplication {
    public static void main(String[] args) {
        SpringApplication.run(HabitsApplication.class, args);
    }
}


