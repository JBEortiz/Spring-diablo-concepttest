package com.micro.charactertracker.controller;

import com.micro.charactertracker.dto.PersonDTO;
import com.micro.charactertracker.service.IGetByIdPersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("person")
public class GetByIdPersonController {
    private final IGetByIdPersonService getByIdPersonService;

    @GetMapping("/{id}")
    public ResponseEntity<PersonDTO> getById(@PathVariable String id) {
        return new ResponseEntity<>(getByIdPersonService.getByIdPerson(id), HttpStatus.OK);
    }
}

