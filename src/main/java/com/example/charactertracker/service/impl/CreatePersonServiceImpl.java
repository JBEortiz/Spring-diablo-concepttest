package com.example.charactertracker.service.impl;

import com.example.charactertracker.dto.PersonDTO;
import lombok.RequiredArgsConstructor;
import com.example.charactertracker.mapper.IPersonMapper;
import org.springframework.stereotype.Service;
import com.example.charactertracker.repository.IPersonRepository;
import com.example.charactertracker.service.ICreatePersonService;

@RequiredArgsConstructor
@Service
public class CreatePersonServiceImpl implements ICreatePersonService {
    private final IPersonRepository personRepository;
    private final IPersonMapper personMapper;

    public PersonDTO createPerson(PersonDTO personDTO) {
        return personMapper.
                toDto(personRepository.
                        save(personMapper.
                                toEntity(personDTO)));
    }

}
