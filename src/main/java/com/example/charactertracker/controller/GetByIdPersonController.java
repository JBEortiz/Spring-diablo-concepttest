package com.example.charactertracker.controller;

import com.example.charactertracker.dto.PersonDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.charactertracker.service.IGetByIdPersonService;

@RequiredArgsConstructor
@RestController
@RequestMapping("person")
public class GetByIdPersonController {
    private final IGetByIdPersonService getByIdPersonService;

    @GetMapping("/getById")
    public ResponseEntity<PersonDTO> getById(@PathVariable String id) {
        return new ResponseEntity<>(getByIdPersonService.getByIdPerson(id), HttpStatus.OK);
    }
}

