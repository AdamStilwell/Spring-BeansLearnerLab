package com.example.demo;

import java.util.Arrays;
import java.util.Iterator;

public class Instructors extends People<Instructor> {
    public Instructors(Instructor... instructors){
        super(Arrays.asList(instructors));
    }

    @Override
    public Iterator<Instructor> iterator() {
        return findAll().iterator();
    }
    
}
