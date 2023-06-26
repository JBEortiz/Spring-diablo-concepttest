package com.micro.charactertracker.service.impl;

import com.micro.charactertracker.service.IDeletePersonService;
import com.micro.charactertracker.entity.Person;
import com.micro.charactertracker.repository.IPersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
