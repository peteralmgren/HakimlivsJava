/*
package com.example.demo.controllers;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@CrossOrigin
@RestController
@RequestMapping("/response")
public class HomeController {


    PersonService personService;

    @PostMapping(
            value = "/postbody",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<Person> postBody(@RequestBody Person person) {
        Person persistedPerson = personService.save(person);
        return ResponseEntity
                .created(URI
                        .create(String.format("/persons/%s", person.getFirstName())))
                .body(persistedPerson);

    }


}
*/
