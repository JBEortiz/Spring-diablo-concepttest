package com.micro.charactertracker.service.impl;

import com.micro.charactertracker.dto.PersonDTO;
import lombok.RequiredArgsConstructor;
import com.micro.charactertracker.mapper.IPersonMapper;
import org.springframework.stereotype.Service;
import com.micro.charactertracker.repository.IPersonRepository;
import com.micro.charactertracker.service.ICreatePersonService;

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
