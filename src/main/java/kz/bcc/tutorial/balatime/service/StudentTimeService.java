package kz.bcc.tutorial.balatime.service;

import kz.bcc.tutorial.balatime.model.dto.StudentTime;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentTimeService {
//    @Query(value = "select tt.time,su.sub_name,t.name,r.room_name,g.groupname from student s,subject su,room r,teacher t,time_table tt, group g" +
//            "where ")
    List<StudentTime> getAllTimeByStudentId(Integer studentId);
}
