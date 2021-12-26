package com.twogathertales.dialogueservice.services.implementation;

import com.twogathertales.dialogueservice.model.display.Display;
import com.twogathertales.dialogueservice.repository.DisplayRepository;
import com.twogathertales.dialogueservice.services.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("dialogueDisplayService")
public class DisplayService implements GenericService<Display> {
    @Autowired
    private DisplayRepository displayRepository;

    @Override
    public Iterable<Display> findAll() {
        return displayRepository.findAll();
    }

    @Override
    public Display find(Long id) {
        return (Display) displayRepository.findById(id).get();
    }

    @Override
    public Display create(Display display) {
        return (Display) displayRepository.save(display);
    }

    @Override
    public void update(Display display) {
        displayRepository.save(display);
    }

    @Override
    public void delete(String id) {
        displayRepository.delete(id);
    }
}
