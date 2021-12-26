package com.twogathertales.dialogueservice.services.implementation;

import com.twogathertales.dialogueservice.model.chapter.Chapter;
import com.twogathertales.dialogueservice.repository.ChapterRepository;
import com.twogathertales.dialogueservice.services.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("dialogueChapterService")
public class ChapterService implements GenericService<Chapter> {
    @Autowired
    private ChapterRepository chapterRepository;


    @Override
    public Iterable<Chapter> findAll() {
        return chapterRepository.findAll();
    }

    @Override
    public Chapter find(Long id) {
        return (Chapter) chapterRepository.findById(id).get();
    }

    @Override
    public Chapter create(Chapter chapter) {
        return (Chapter) chapterRepository.save(chapter);
    }

    @Override
    public void update(Chapter chapter) {
        chapterRepository.save(chapter);
    }

    @Override
    public void delete(String id) {
        chapterRepository.delete(id);
    }
}
