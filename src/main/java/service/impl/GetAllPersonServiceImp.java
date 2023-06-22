package service.impl;

import dto.PersonDTO;
import lombok.RequiredArgsConstructor;
import mapper.IPersonMapper;
import org.springframework.stereotype.Service;
import repository.IPersonRepository;
import service.IGetAllPersonService;

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
