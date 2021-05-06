package kz.bcc.tutorial.balatime.repository;

import kz.bcc.tutorial.balatime.model.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonRepository extends JpaRepository<Lesson, Integer> {
}
