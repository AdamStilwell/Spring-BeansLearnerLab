package com.example.demo;


public class Student extends Person implements Learner{
    public Student(Long id, String name) {
        super(id, name);
    }

    public double totalStudyTime;

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
