package com.twogathertales.dialogueservice.model.event;

import com.sun.istack.Nullable;
import com.twogathertales.dialogueservice.model.chapter.Chapter;
import com.twogathertales.dialogueservice.model.choice.Choice;
import com.twogathertales.dialogueservice.model.display.Display;
import lombok.Data;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="event", schema="avarum_dialogue")
@Data
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "chapter_id")
    private Long chapter;

    @Column(name = "type")
    private String type;

    @Column(name = "text")
    private String text;

    @Column(name = "target", nullable = true)
    private Long target;

    @OneToMany(mappedBy = "event")
    private Set<Choice> choices;

    @OneToMany(mappedBy = "event")
    private Set<Display> displays;
}
