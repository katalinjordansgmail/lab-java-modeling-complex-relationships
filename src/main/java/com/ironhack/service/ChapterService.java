/* (C)2024 */
package com.ironhack.service;

import com.ironhack.model.Chapter;
import com.ironhack.repository.ChapterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ChapterService {
    @Autowired
    private ChapterRepository chapterRepository;

    public Optional<Chapter> searchChapterByDistrict(String district) {
        return chapterRepository.findChapterByDistrict(district);
    }

}
