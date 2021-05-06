package kz.bcc.tutorial.balatime.service;

import kz.bcc.tutorial.balatime.model.UserRole;

import java.util.List;

public interface UserRoleService {
    UserRole create(UserRole userRole);

    UserRole getById(Integer id);

    List<UserRole> getAll();

    void delete(Integer id);
}
