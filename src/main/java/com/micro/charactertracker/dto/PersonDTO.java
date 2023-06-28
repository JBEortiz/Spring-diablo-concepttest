package com.micro.charactertracker.dto;

import lombok.*;
import com.micro.charactertracker.enums.Breeds;

@Getter
@Setter
public class PersonDTO {

    private Long idPerson;
    private String inventoryId;
    private String name;
    private Integer level;
    private Integer lifePoints;
    private Integer skillPoints;
    private Breeds breeds;
}