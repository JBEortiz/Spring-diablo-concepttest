package com.micro.charactertracker.service.impl;

import com.micro.charactertracker.service.IGetByIdPersonService;
import com.micro.charactertracker.dto.PersonDTO;
import com.micro.charactertracker.repository.IPersonRepository;
import lombok.RequiredArgsConstructor;
import com.micro.charactertracker.mapper.IPersonMapper;
import org.springframework.stereotype.Service;

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
