package com.twogathertales.dialogueservice.model.character;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name="character", schema="avarum_dialogue")
@Data
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "picture")
    private String picture;

    @Column(name = "color")
    private String color;
}
