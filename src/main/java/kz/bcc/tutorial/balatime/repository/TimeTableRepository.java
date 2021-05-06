package kz.bcc.tutorial.balatime.repository;

import kz.bcc.tutorial.balatime.model.TimeTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeTableRepository extends JpaRepository<TimeTable, Integer> {
}
