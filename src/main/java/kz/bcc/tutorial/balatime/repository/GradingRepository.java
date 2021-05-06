package kz.bcc.tutorial.balatime.repository;

import kz.bcc.tutorial.balatime.model.Grading;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradingRepository extends JpaRepository<Grading, Integer> {
}
