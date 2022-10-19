package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student julian = new Student(
                    1L,
                    "Julian Polanco",
                    "julian.polanco@gmail.com",
                    LocalDate.of(2002, Month.SEPTEMBER, 14)
            );
            Student alex = new Student(
                    2L,
                    "alex",
                    "alex.polanco@gmail.com",
                    LocalDate.of(1994, Month.SEPTEMBER, 4)
            );
            repository.saveAll(
                    List.of(julian, alex)
            );
        };
    }
}
