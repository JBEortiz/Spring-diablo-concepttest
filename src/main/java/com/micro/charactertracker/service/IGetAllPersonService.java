package com.micro.charactertracker.service;

import com.micro.charactertracker.dto.PersonDTO;

import java.util.List;

public interface IGetAllPersonService {
    List<PersonDTO> getAllPerson();
}
