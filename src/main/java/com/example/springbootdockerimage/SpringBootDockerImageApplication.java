package com.example.springbootdockerimage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class SpringBootDockerImageApplication {
    @GetMapping
    public String message(){
        return " hello docker....";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDockerImageApplication.class, args);
    }

}
