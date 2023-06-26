package com.micro.charactertracker.controller;

import com.micro.charactertracker.service.IDeletePersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("person")
public class DeletePersonController {
    private final IDeletePersonService deletePersonService;

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable String idPerson) {
        deletePersonService.deletePerson(idPerson);
    }
}
