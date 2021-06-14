package kz.bcc.tutorial.balatime.service;

import kz.bcc.tutorial.balatime.model.dto.teacherSH.SchedulerRow;

import java.util.List;

public interface TeacherSHService {
        List<SchedulerRow>getAll(Integer teacherId, Integer year, Integer month, Integer day);
}
