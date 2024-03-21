/* (C)2024 */
package com.ironhack.repository;

import com.ironhack.model.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ChapterRepository extends JpaRepository<Chapter, Integer> {
    Optional<Chapter> findChapterByDistrict(String district);
}
