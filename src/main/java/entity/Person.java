package entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import repository.Breeds;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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
    @GenericGenerator(name = "system-uuid", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", length = 36, unique = true)
    private UUID id;
    private String name;
    private Integer level;
    private String classType;
    private Integer lifePoints;
    private Integer skillPoints;
    private Breeds breeds;

}
