package com.practice.springpractice.controller;


import com.practice.springpractice.response.Person;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/json")
public class JsonController {

    @GetMapping("/{id}/{name}/{lastname}")
    public ResponseEntity<Person> person(@PathVariable Long id, @PathVariable String name, @PathVariable String lastname){
        return ResponseEntity
                .status(202)
                .body(new Person(id,name,lastname));
    }
    @PostMapping
    public ResponseEntity<Person> save(@RequestBody @Valid Person person){
        return ResponseEntity.ok(person);
    }



}
