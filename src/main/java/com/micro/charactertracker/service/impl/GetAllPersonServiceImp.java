package com.micro.charactertracker.service.impl;

import com.micro.charactertracker.service.IGetAllPersonService;
import com.micro.charactertracker.dto.PersonDTO;
import com.micro.charactertracker.mapper.IPersonMapper;
import com.micro.charactertracker.repository.IPersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class GetAllPersonServiceImp implements IGetAllPersonService {
    private final IPersonRepository personRepository;
    private final IPersonMapper personMapper;

    @Override
    public List<PersonDTO> getAllPerson() {
        return personMapper.
                toDtoList(personRepository
                        .findAll());
    }
}
