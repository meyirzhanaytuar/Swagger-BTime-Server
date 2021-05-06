package kz.bcc.tutorial.balatime.repository;

import kz.bcc.tutorial.balatime.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {
}
