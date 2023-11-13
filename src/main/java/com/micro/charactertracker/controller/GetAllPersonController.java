package com.micro.charactertracker.controller;

import com.micro.charactertracker.dto.PersonDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.micro.charactertracker.service.IGetAllPersonService;

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
