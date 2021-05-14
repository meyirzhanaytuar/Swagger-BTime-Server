package kz.bcc.tutorial.balatime.repository;

import kz.bcc.tutorial.balatime.model.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LessonRepository extends JpaRepository<Lesson, Integer> {
//    List<Lesson> findAllBySub_id(Integer subjectId);
//
//    List<Lesson> findAllBySub_idIn(List<Integer> subjectIdList);

    @Query(value = "select l from Lesson l where l.sub_id = ?1")
    List<Lesson> getAll123(Integer sub_id);

//    List<Lesson> findAllByIdAndSub_id(Integer id, Integer subId);
}
