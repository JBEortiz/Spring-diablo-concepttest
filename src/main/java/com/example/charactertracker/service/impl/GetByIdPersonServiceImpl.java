package com.example.charactertracker.service.impl;

import com.example.charactertracker.service.IGetByIdPersonService;
import com.example.charactertracker.dto.PersonDTO;
import lombok.RequiredArgsConstructor;
import com.example.charactertracker.mapper.IPersonMapper;
import org.springframework.stereotype.Service;
import com.example.charactertracker.repository.IPersonRepository;

import java.util.UUID;

@RequiredArgsConstructor
@Service
public class GetByIdPersonServiceImpl implements IGetByIdPersonService {
    private final IPersonRepository personRepository;
    private final IPersonMapper personMapper;


    @Override
    public PersonDTO getByIdPerson(String idPerson) {
        return personMapper.
                toDto(personRepository.getReferenceById(
                                UUID.fromString(idPerson)));
    }
}
