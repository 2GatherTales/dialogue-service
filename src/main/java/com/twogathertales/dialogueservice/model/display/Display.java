package com.twogathertales.dialogueservice.model.display;

import com.twogathertales.dialogueservice.model.chapter.Chapter;
import com.twogathertales.dialogueservice.model.character.Character;
import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name="displays", schema="avarum_dialogue")
@Data
public class Display {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @ManyToOne
    @JoinColumn(name="chapter_id", nullable = false)
    private Chapter chapter;

    @OneToOne
    @JoinColumn(name = "character_id", nullable = false)
    private Character character;

    @Column(name = "side")
    private String side;

    @Column(name = "is_speaker", columnDefinition = "int2")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean isSpeaker;
}
