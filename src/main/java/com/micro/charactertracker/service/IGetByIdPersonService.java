package com.micro.charactertracker.service;


import com.micro.charactertracker.dto.PersonDTO;

public interface IGetByIdPersonService {
    public PersonDTO getByIdPerson(String idPerson);
}
