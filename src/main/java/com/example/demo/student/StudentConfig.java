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
    CommandLineRunner commandLineRunner( StudentRepository repository ){
        return args -> {
            Student Ankit = new Student(
                    "Ankit",
                    "ankitkumaryadav0000@gmail.com",
                    LocalDate.of(2000, Month.JULY,27)
            );

            Student Akshat = new Student(
                    "Akshat",
                    "aknova360gmail.com",
                    LocalDate.of(2000, Month.AUGUST,5)
            );

            repository.saveAll(
                    List.of(Ankit,Akshat )
            );
        };
    }
}
