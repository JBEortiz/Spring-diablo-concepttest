package com.micro.charactertracker.repository;

import com.micro.charactertracker.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IPersonRepository extends JpaRepository<Person, Long> {
}
