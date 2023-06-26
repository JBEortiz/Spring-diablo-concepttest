package com.micro.charactertracker.entity;

import com.micro.charactertracker.enums.Breeds;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Builder
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PERSON")
public class Person {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", length = 36, unique = true)
    private UUID id;
    private String inventoryId;
    private String name;
    private Integer level;
    private Integer lifePoints;
    private Integer skillPoints;
    private Breeds breeds;

}
