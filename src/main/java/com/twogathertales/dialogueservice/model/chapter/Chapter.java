package com.twogathertales.dialogueservice.model.chapter;

import com.twogathertales.dialogueservice.model.display.Display;
import com.twogathertales.dialogueservice.model.event.Event;
import lombok.Data;
import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name="chapter", schema="avarum_dialogue")
@Data
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "chapter")
    private Set<Event> events;
}
