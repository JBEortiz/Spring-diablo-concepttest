package com.example.charactertracker.dto;

import lombok.*;
import com.example.charactertracker.enums.Breeds;

@Getter
@Setter
public class PersonDTO {

    private String id;
    private String inventoryId;
    private String name;
    private Integer level;
    private Integer lifePoints;
    private Integer skillPoints;
    private Breeds breeds;
}