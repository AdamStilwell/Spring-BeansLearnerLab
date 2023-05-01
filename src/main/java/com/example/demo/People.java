package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.apereo.services.persondir.support.xml.om.Person;

public abstract class People<PersonType extends Person> implements Iterable<PersonType>{
    List<PersonType> personList;

    public People(List<PersonType> personList) {
        this.personList = personList;
    }

    public People(PersonType... people){
        personList = Arrays.asList(people);
    }

    public void addPerson(PersonType person){
        personList.add(person);
    }
    
    public void removePerson(PersonType person){
        personList.remove(person);
    }

    public Integer sizeOfList(){
        return personList.size();
    }

    public void clearList(){
        personList.clear();
    }

    public void addAllPeople(Iterable<PersonType> people){
        for(PersonType person: people){
            addPerson(person);
        }
    }

    public PersonType<> findById(long id){
        for(PersonType person: personList){
            if(person.getId().equals(id)){
                return person;
            }
        }
        return null;
    }

    public List<PersonType> findAll(){
        return personList;
    }
}
