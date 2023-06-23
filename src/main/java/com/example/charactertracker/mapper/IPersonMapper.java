package com.example.charactertracker.mapper;


import com.example.charactertracker.dto.PersonDTO;
import com.example.charactertracker.entity.Person;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IPersonMapper {
    Person toEntity(PersonDTO dto);
    PersonDTO toDto(Person entity);
    List<Person> toEntityList(List<PersonDTO> dto);
    List<PersonDTO> toDtoList(List<Person> entity);
}
