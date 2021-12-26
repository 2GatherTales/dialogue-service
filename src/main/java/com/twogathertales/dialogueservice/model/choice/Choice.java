package com.twogathertales.dialogueservice.model.choice;

import com.twogathertales.dialogueservice.model.event.Event;
import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name="choices", schema="avarum_dialogue")
@Data
public class Choice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @ManyToOne
    @JoinColumn(name="event_id", nullable = false)
    private Event event;

    @Column(name = "text")
    private String text;

    @Column(name = "target")
    private long target;
}
