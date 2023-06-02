package com.itavare0.customer.dao;

import com.itavare0.customer.modal.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FakePersonDataAccessService implements PersonDao {

    private static final List<Person> DB = new ArrayList<>();


    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName()));
        return 1;
    }

    @Override
    public int insertPerson(Person person) {
        return PersonDao.super.insertPerson(person);
    }
}
