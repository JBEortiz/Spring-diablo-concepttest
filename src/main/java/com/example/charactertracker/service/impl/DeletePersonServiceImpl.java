package com.example.charactertracker.service.impl;

import com.example.charactertracker.service.IDeletePersonService;
import com.example.charactertracker.entity.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.charactertracker.repository.IPersonRepository;

import java.util.UUID;

@RequiredArgsConstructor
@Service
public class DeletePersonServiceImpl implements IDeletePersonService {
    private final IPersonRepository personRepository;
    @Override
    public void deletePerson(String idPerson) {
        Person person = personRepository.getReferenceById(UUID.fromString(idPerson));
        personRepository.delete(person);
    }
}
