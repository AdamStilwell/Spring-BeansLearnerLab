package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {
    
    @Bean(name = "instructors")
    public Instructors tcUsaInstructors(){
        Instructors instructorsTcUsa = new Instructors();
        instructorsTcUsa.addPerson(new Instructor(0L, "Mr. Fish"));
        instructorsTcUsa.addPerson(new Instructor(1L, "Mr. Fox"));
        instructorsTcUsa.addPerson(new Instructor(2L, "Mr. Bungaloo"));
        instructorsTcUsa.addPerson(new Instructor(3L, "Mrs. Swiftly"));
        return instructorsTcUsa;
    }

    @Bean(name = "instructors")
    public Instructors tcUkInstructors(){
        Instructors instructorsTcUk = new Instructors();
        instructorsTcUk.addPerson(new Instructor(0L, "Mr. Krumpit"));
        instructorsTcUk.addPerson(new Instructor(1L, "Mr. Tea"));
        instructorsTcUk.addPerson(new Instructor(2L, "Mr. Chips"));
        instructorsTcUk.addPerson(new Instructor(3L, "Mrs. Innit"));
        return instructorsTcUk;
    }

    @Bean(name = "instructors")
    @Primary
    public Instructors instructors(){
        Instructors instructors = new Instructors();
        instructors.addPerson(new Instructor(0L, "Desa"));
        instructors.addPerson(new Instructor(1L, "Kris"));
        instructors.addPerson(new Instructor(2L, "Dan"));
        instructors.addPerson(new Instructor(3L, "Dolio"));
        return instructors;
    }

}
