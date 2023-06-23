package com.example.charactertracker.dto;

import lombok.*;
import com.example.charactertracker.enums.Breeds;

@Getter
@Setter
public class PersonDTO {

    private String uuid;
    private String name;
    private Integer level;
    private String classType;
    private Integer lifePoints;
    private Integer skillPoints;
    private Breeds breeds;
}