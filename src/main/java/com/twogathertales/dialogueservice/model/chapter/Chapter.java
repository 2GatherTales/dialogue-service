package com.twogathertales.dialogueservice.model.chapter;

import com.twogathertales.dialogueservice.model.display.Display;
import com.twogathertales.dialogueservice.model.event.Event;
import lombok.Data;
import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name="chapters", schema="avarum_dialogue")
@Data
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @OneToMany(mappedBy = "chapter")
    private Set<Event> events;
}
