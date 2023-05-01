package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    
    @Bean(name = "students")
    public Students currentStudents(){
        Students current = new Students();
        current.addPerson(new Student(0L, "Burnst"));
        current.addPerson(new Student(1L, "Brunst"));
        current.addPerson(new Student(2L, "Turbst"));
        current.addPerson(new Student(3L, "Trinks"));
        current.addPerson(new Student(4L, "Loist"));
        return current;
    }

    @Bean
    public Students previousStudents(){
        Students previous = new Students();
        previous.addPerson(new Student(0L, "Hermy"));
        previous.addPerson(new Student(1L, "Retmy"));
        previous.addPerson(new Student(2L, "Lormy"));
        previous.addPerson(new Student(3L, "Spormy"));
        previous.addPerson(new Student(4L, "Mutly"));
        return previous;
    }

}
