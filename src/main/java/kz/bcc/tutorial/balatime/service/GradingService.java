package kz.bcc.tutorial.balatime.service;

import kz.bcc.tutorial.balatime.model.Grading;

import java.util.List;

public interface GradingService {
    Grading create(Grading grading);

    Grading getById(Integer id);

    List<Grading> getAll();

    void delete(Integer id);
}
