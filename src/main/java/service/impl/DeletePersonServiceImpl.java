package service.impl;

import entity.Person;
import lombok.RequiredArgsConstructor;
import mapper.IPersonMapper;
import org.springframework.stereotype.Service;
import repository.IPersonRepository;
import service.IDeletePersonService;

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
