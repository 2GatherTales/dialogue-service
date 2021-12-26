package com.twogathertales.dialogueservice.repository;

import com.twogathertales.dialogueservice.model.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository()
public interface EventRepository<T> extends JpaRepository<Event, Long>{

}