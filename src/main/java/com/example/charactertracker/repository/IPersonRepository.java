package com.example.charactertracker.repository;

import com.example.charactertracker.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IPersonRepository extends JpaRepository<Person, UUID> {
}
