package kz.bcc.tutorial.balatime.repository;

import kz.bcc.tutorial.balatime.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepositoryPaging extends PagingAndSortingRepository<Student, Integer> {
    Page<Student> findAll(Pageable pageable);
}
