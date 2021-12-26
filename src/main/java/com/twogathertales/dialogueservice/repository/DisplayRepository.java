package com.twogathertales.dialogueservice.repository;

import com.twogathertales.dialogueservice.model.display.Display;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository()
public interface DisplayRepository<T> extends JpaRepository<Display, Long>{

}
