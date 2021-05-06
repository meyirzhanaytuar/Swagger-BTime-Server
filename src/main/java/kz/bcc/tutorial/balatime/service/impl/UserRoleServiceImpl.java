package kz.bcc.tutorial.balatime.service.impl;

import kz.bcc.tutorial.balatime.model.UserRole;
import kz.bcc.tutorial.balatime.repository.UserRoleRepository;
import kz.bcc.tutorial.balatime.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Autowired
    UserRoleRepository userRoleRepository;

    @Override
    public UserRole create(UserRole userRole) {
        return userRoleRepository.save(userRole);
    }

    @Override
    public UserRole getById(Integer id) {
        Optional<UserRole> optionalUserRole = userRoleRepository.findById(id);
        if (optionalUserRole.isPresent()) {
            return userRoleRepository.findById(id).get();
        } else {
            return null;
        }
    }

    @Override
    public List<UserRole> getAll() {
        return userRoleRepository.findAll();
    }

    @Override
    public void delete(Integer id) {

    }
}
