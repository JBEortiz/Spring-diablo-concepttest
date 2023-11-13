package com.micro.charactertracker.mapper;


import com.micro.charactertracker.dto.PersonDTO;
import com.micro.charactertracker.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IPersonMapper {
    @Mapping(target = "id", ignore = true)
    Person toEntity(PersonDTO dto);
    PersonDTO toDto(Person entity);
    List<Person> toEntityList(List<PersonDTO> dto);
    List<PersonDTO> toDtoList(List<Person> entity);
}
