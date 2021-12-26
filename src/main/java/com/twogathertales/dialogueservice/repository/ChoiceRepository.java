package com.twogathertales.dialogueservice.repository;

import com.twogathertales.dialogueservice.model.choice.Choice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository()
public interface ChoiceRepository<T> extends JpaRepository<Choice, Long> {
}
