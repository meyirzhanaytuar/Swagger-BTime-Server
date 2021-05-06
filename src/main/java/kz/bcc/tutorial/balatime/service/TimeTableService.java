package kz.bcc.tutorial.balatime.service;

import kz.bcc.tutorial.balatime.model.TimeTable;

import java.util.List;

public interface TimeTableService {
    TimeTable create(TimeTable timeTable);

    TimeTable getById(Integer id);

    List<TimeTable> getAll();

    void delete(Integer id);
}
