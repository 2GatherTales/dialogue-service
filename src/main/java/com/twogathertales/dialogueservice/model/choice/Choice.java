package com.twogathertales.dialogueservice.model.choice;

import com.twogathertales.dialogueservice.model.event.Event;
import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name="choice", schema="avarum_dialogue")
@Data
public class Choice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "event_id")
    private Long event;

    @Column(name = "text")
    private String text;

    @Column(name = "target")
    private Long target;
}
