package com.example.demo;

import org.apereo.services.persondir.support.xml.om.Person;

import scala.collection.immutable.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType>{
    public People(PersonType listOfPeople){
        List personList = listOfPeople;
    }
    
}
