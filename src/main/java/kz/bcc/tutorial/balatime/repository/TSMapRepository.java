package kz.bcc.tutorial.balatime.repository;

import kz.bcc.tutorial.balatime.model.TSMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TSMapRepository extends JpaRepository<TSMap, Integer> {
}
