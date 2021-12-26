package com.twogathertales.dialogueservice.repository;

import com.twogathertales.dialogueservice.model.chapter.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository()
public interface ChapterRepository<T> extends JpaRepository<Chapter, Long> {

}