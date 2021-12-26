package com.twogathertales.dialogueservice.repository;

import com.twogathertales.dialogueservice.model.character.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("characterRepository")
public interface CharacterRepository<T> extends JpaRepository<Character, Long>{

}
