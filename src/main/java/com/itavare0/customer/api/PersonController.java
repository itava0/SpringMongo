package com.itavare0.customer.api;

import com.itavare0.customer.modal.Person;
import com.itavare0.customer.service.PersonService;

public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    public void addPerson(Person person) {
        personService.addPerson(person);
    }
}
