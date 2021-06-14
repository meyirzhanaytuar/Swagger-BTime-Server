package kz.bcc.tutorial.balatime.service.impl;

import kz.bcc.tutorial.balatime.model.Lesson;
import kz.bcc.tutorial.balatime.repository.LessonRepository;
import kz.bcc.tutorial.balatime.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LessonServiceImpl implements LessonService {
    @Autowired
    LessonRepository lessonRepository;

    @Override
    public Lesson create(Lesson lesson) {
        return lessonRepository.saveAndFlush(lesson);
    }

    @Override
    public Lesson getById(Integer id) {
        Optional<Lesson> optionalLesson = lessonRepository.findById(id);
        if (optionalLesson.isPresent()) {
            return lessonRepository.findById(id).get();
        } else {
            return null;
        }
    }

    @Override
    public List<Lesson> getAll() {
        return lessonRepository.findAll();
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<Lesson> getAllBySubjectId(Integer SubjectId) {
        return lessonRepository.getAll123(SubjectId);
    }

}
