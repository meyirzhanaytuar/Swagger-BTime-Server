package kz.bcc.tutorial.balatime.repository;

import kz.bcc.tutorial.balatime.model.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LessonRepository extends JpaRepository<Lesson, Integer> {

    @Query(value = "select l from Lesson l where l.subId = ?1")
    List<Lesson> getAll123(Integer subId);
}
