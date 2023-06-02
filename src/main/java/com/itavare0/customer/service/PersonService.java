package com.itavare0.customer.service;

import com.itavare0.customer.dao.PersonDao;
import com.itavare0.customer.modal.Person;

public class PersonService {

    private final PersonDao personDao;

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person) {
        return personDao.insertPerson(person);
    }
}
