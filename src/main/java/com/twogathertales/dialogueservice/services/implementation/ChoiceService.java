package com.twogathertales.dialogueservice.services.implementation;

import com.twogathertales.dialogueservice.model.choice.Choice;
import com.twogathertales.dialogueservice.repository.ChoiceRepository;
import com.twogathertales.dialogueservice.services.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("dialogueChoiceService")
public class ChoiceService implements GenericService<Choice> {
    @Autowired
    private ChoiceRepository choiceRepository;

    @Override
    public Iterable<Choice> findAll() {
        return choiceRepository.findAll();
    }

    @Override
    public Choice find(Long id) {
        return (Choice) choiceRepository.findById(id).get();
    }

    @Override
    public Choice create(Choice choice) {
        return (Choice) choiceRepository.save(choice);
    }

    @Override
    public void update(Choice choice) {
        choiceRepository.save(choice);
    }

    @Override
    public void delete(String id) {
        choiceRepository.delete(id);
    }
}
