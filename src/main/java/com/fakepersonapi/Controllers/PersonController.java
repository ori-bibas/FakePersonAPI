package com.fakepersonapi.Controllers;

import com.fakepersonapi.Entities.Person;
import com.fakepersonapi.Services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/person")
    public Person getPerson() {
        return null;
    }

}
