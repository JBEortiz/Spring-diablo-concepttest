package com.example.charactertracker.service;


import com.example.charactertracker.dto.PersonDTO;

import java.util.UUID;

public interface IGetByIdPersonService {
    public PersonDTO getByIdPerson(String idPerson);
}
