package service;

import dto.PersonDTO;

import java.util.UUID;

public interface IGetByIdPersonService {
    public PersonDTO getByIdPerson(String idPerson);
}
