package com.twogathertales.dialogueservice.model.display;

import com.twogathertales.dialogueservice.model.character.Character;
import com.twogathertales.dialogueservice.model.event.Event;
import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name="display", schema="avarum_dialogue")
@Data
public class Display {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "event_id")
    private Long event;

    @OneToOne
    @JoinColumn(name = "character_id", nullable = false)
    private Character character;

    @Column(name = "side")
    private String side;

    @Column(name = "is_speaker", columnDefinition = "int2")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean isSpeaker;
}
