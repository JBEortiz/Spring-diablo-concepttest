package mapper;

import dto.PersonDTO;
import entity.Person;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IPersonMapper {
    Person toEntity(PersonDTO dto);
    PersonDTO toDto(Person entity);
    List<Person> toEntityList(List<PersonDTO> dto);
    List<PersonDTO> toDtoList(List<Person> entity);
}
