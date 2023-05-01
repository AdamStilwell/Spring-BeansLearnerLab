package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {
    @Autowired
    Instructors instructors;

    @Autowired
    Students students;

    @Bean
    @DependsOn({"students", "instructors"})
    public Classroom currentCohort(){
        return new Classroom(students, instructors);
    }

    @Bean
    @DependsOn({"previousStudents", "instructors"})
    public Classroom previousCohort(){
        return new Classroom(students, instructors);
    }
}
