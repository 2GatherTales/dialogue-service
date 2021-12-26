package com.twogathertales.dialogueservice.services.implementation;

import com.twogathertales.dialogueservice.model.character.Character;
import com.twogathertales.dialogueservice.repository.CharacterRepository;
import com.twogathertales.dialogueservice.services.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("dialogueCharacterService")
public class CharacterService implements GenericService<Character> {
    @Autowired
    private CharacterRepository characterRepository;


    @Override
    public Iterable<Character> findAll() {
        return characterRepository.findAll();
    }

    @Override
    public Character find(Long id) {
        return (Character) characterRepository.findById(id).get();
    }

    @Override
    public Character create(Character character) {
        return (Character) characterRepository.save(character);
    }

    @Override
    public void update(Character character) {
        characterRepository.save(character);
    }

    @Override
    public void delete(String id) {
        characterRepository.delete(id);
    }
}
