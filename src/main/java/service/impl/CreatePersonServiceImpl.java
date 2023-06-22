package service.impl;

import dto.PersonDTO;
import lombok.RequiredArgsConstructor;
import mapper.IPersonMapper;
import org.springframework.stereotype.Service;
import repository.IPersonRepository;
import service.ICreatePersonService;

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
