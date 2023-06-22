package repository;

import entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

public interface IPersonRepository extends JpaRepository<Person, UUID> {
}
