package com.example.demo;

import com.example.demo.service.MockDataService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

    }

    @Bean
    CommandLineRunner run(MockDataService mockDataService) {
        return args -> {
            System.out.println("Printing Mock Data:");
            mockDataService.getBuildings().forEach(System.out::println);
        };
    }


}
