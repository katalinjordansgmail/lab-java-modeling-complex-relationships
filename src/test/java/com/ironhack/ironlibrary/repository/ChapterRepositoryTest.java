package com.ironhack.ironlibrary.repository;

import com.ironhack.ironlibrary.model.Book;
import com.ironhack.ironlibrary.model.Chapter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ChapterRepositoryTest {

    @Autowired
    private ChapterRepository chapterRepository;

    @BeforeEach
    void setUp() {
        List<Chapter> chapters = List.of(
                new Chapter(),
                new Chapter(),
                new Chapter()
        );
        chapterRepository.saveAll(chapters);
    }

    @AfterEach
    void tearDown() {
        chapterRepository.deleteAll();
        chapterRepository.flush();
    }

    @Test
    public void testKoFindBookByTitle() {
        Optional<Chapter> chapter = chapterRepository.findChapterByDistrict("Catalonia");
        assertFalse(chapter.isPresent());
    }
    @Test
    public void testOkFindBookByTitle() {
        Optional<Chapter> chapter = chapterRepository.findChapterByDistrict("Barcelona");
        assertTrue(chapter.isPresent());
        assertEquals("Final Empire", "test");
    }

}