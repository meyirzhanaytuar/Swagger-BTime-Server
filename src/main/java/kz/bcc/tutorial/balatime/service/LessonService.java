package kz.bcc.tutorial.balatime.service;

import kz.bcc.tutorial.balatime.model.Lesson;

import java.util.List;

public interface LessonService {
    Lesson create(Lesson lesson);

    Lesson getById(Integer id);

    List<Lesson> getAll();

    void delete(Integer id);

    List<Lesson> getAllBySubjectId(Integer SubjectId);
}
