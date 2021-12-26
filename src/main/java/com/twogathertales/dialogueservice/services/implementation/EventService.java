package com.twogathertales.dialogueservice.services.implementation;

import com.twogathertales.dialogueservice.model.event.Event;
import com.twogathertales.dialogueservice.repository.EventRepository;
import com.twogathertales.dialogueservice.services.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("dialogueEventService")
public class EventService implements GenericService<Event> {

    @Autowired
    private EventRepository eventRepository;


    @Override
    public Iterable<Event> findAll() {
        return eventRepository.findAll();
    }

    @Override
    public Event find(Long id) {
        return (Event) eventRepository.findById(id).get();
    }

    @Override
    public Event create(Event event) {
        return (Event) eventRepository.save(event);
    }

    @Override
    public void update(Event event) {
        eventRepository.save(event);
    }

    @Override
    public void delete(String id) {
        eventRepository.delete(id);
    }
}
