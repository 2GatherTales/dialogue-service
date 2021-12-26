package com.twogathertales.dialogueservice.model.character;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name="characters", schema="avarum_dialogue")
@Data
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "picture")
    private String picture;

    @Column(name = "color")
    private String color;
}
