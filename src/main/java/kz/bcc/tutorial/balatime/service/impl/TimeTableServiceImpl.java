package kz.bcc.tutorial.balatime.service.impl;

import kz.bcc.tutorial.balatime.model.TimeTable;
import kz.bcc.tutorial.balatime.repository.TimeTableRepository;
import kz.bcc.tutorial.balatime.service.TimeTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TimeTableServiceImpl implements TimeTableService {
    @Autowired
    TimeTableRepository timeTableRepository;

    @Override
    public TimeTable create(TimeTable timeTable) {
        return timeTableRepository.save(timeTable);
    }

    @Override
    public TimeTable getById(Integer id) {
        Optional<TimeTable> optionalTimeTable = timeTableRepository.findById(id);
        if (optionalTimeTable.isPresent()) {
            return timeTableRepository.findById(id).get();
        } else {
            return null;
        }
    }

    @Override
    public List<TimeTable> getAll() {
        return timeTableRepository.findAll();
    }

    @Override
    public void delete(Integer id) {

    }
}
