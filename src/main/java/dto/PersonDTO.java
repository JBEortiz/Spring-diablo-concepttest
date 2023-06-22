package dto;

import lombok.*;
import repository.Breeds;

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
