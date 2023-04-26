package com.example.demo;

import org.apereo.services.persondir.support.xml.om.Person;

public class Instructor extends Person implements Teacher {

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        int count =0;
        for (Learner learner : learners) {
            count++;
        }
        double numberOfHoursPerLearner = numberOfHours / count;
        for (Learner learner : learners) {
            learner.learn(numberOfHoursPerLearner);
        }
    }

    
}
