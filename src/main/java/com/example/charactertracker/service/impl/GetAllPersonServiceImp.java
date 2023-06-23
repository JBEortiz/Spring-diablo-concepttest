package com.example.charactertracker.service.impl;

import com.example.charactertracker.service.IGetAllPersonService;
import com.example.charactertracker.dto.PersonDTO;
import lombok.RequiredArgsConstructor;
import com.example.charactertracker.mapper.IPersonMapper;
import org.springframework.stereotype.Service;
import com.example.charactertracker.repository.IPersonRepository;

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
