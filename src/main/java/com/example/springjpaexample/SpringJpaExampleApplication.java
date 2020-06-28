package com.example.springjpaexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@Import(KeesunRegistrar.class)
public class SpringJpaExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaExampleApplication.class, args);
    }

}
