package com.group.libraryapp.temp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PsersonController {

    private final PersonService personService;

    public PsersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/test/person")
    public void testPerson(){
        personService.savePerson();
    }
}
