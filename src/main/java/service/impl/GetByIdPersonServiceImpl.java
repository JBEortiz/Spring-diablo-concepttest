package service.impl;

import dto.PersonDTO;
import lombok.RequiredArgsConstructor;
import mapper.IPersonMapper;
import org.springframework.stereotype.Service;
import repository.IPersonRepository;
import service.IGetByIdPersonService;

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
