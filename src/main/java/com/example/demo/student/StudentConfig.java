package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student erik = new Student("Erik", "erik@gmail.com",
                    LocalDate.of(2005, 5, 25));
            Student alex = new Student("Alex", "alex@gmail.com",
                    LocalDate.of(2004, 2, 15));

            repository.saveAll(List.of(erik, alex));
        };
    }
}
