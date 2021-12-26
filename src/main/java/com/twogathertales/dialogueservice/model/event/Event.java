package com.twogathertales.dialogueservice.model.event;

import com.twogathertales.dialogueservice.model.chapter.Chapter;
import com.twogathertales.dialogueservice.model.choice.Choice;
import lombok.Data;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="events", schema="avarum_dialogue")
@Data
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @ManyToOne
    @JoinColumn(name="chapter_id", nullable = false)
    private Chapter chapter;

    @Column(name = "type")
    private String type;

    @Column(name = "text")
    private String text;

    @Column(name = "target")
    private long target;

    @OneToMany(mappedBy = "event")
    private Set<Choice> events;
}
