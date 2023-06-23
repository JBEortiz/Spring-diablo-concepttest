package com.example.charactertracker.controller;

import com.example.charactertracker.dto.PersonDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.charactertracker.service.IGetAllPersonService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("person")
public class GetAllPersonController {
    private final IGetAllPersonService getAllPersonService;

    @GetMapping("/getAll")
    public List<PersonDTO> getAllPerson() {
        return getAllPersonService.getAllPerson();
    }
}
