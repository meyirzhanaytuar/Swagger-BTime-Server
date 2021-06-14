package kz.bcc.tutorial.balatime.service.impl;

import kz.bcc.tutorial.balatime.model.dto.teacherSH.LessonItem;
import kz.bcc.tutorial.balatime.model.dto.teacherSH.SchedulerRow;
import kz.bcc.tutorial.balatime.service.TeacherSHService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherSHServiceImpl implements TeacherSHService {
    @Override
    public List<SchedulerRow> getAll(Integer teacherId, Integer year, Integer month, Integer day) {
        List<SchedulerRow> answer = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            SchedulerRow schedulerRow = new SchedulerRow();
            schedulerRow.setTime((i+8)+":55");
            LessonItem l1 = new LessonItem();
            l1.setTeacher("teacher l1"+i);
            l1.setGroup("group l1"+i);
            l1.setName("name l1"+i);
            l1.setClassRoom("classroom l1"+i);
            schedulerRow.setL1(l1);
            LessonItem l2 = new LessonItem();
            l2.setTeacher("teacher l2"+i);
            l2.setGroup("group l2"+i);
            l2.setName("name l2"+i);
            l2.setClassRoom("classroom l2"+i);
            schedulerRow.setL2(l2);
            LessonItem l3 = new LessonItem();
            l3.setTeacher("teacher l3"+i);
            l3.setGroup("group l3"+i);
            l3.setName("name l3"+i);
            l3.setClassRoom("classroom l3"+i);
            schedulerRow.setL3(l3);
            LessonItem l4 = new LessonItem();
            l4.setTeacher("teacher l4"+i);
            l4.setGroup("group l4"+i);
            l4.setName("name l4"+i);
            l4.setClassRoom("classroom l4"+i);
            schedulerRow.setL4(l4);
            LessonItem l5 = new LessonItem();
            l5.setTeacher("teacher l5"+i);
            l5.setGroup("group l5"+i);
            l5.setName("name l5"+i);
            l5.setClassRoom("classroom l5"+i);
            schedulerRow.setL5(l5);
            answer.add(schedulerRow);
        }
        return answer;
    }
}
