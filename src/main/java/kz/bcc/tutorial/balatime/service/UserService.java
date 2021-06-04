package kz.bcc.tutorial.balatime.service;

import kz.bcc.tutorial.balatime.model.User;
import kz.bcc.tutorial.balatime.model.UserUpdateDto;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserService {
    User create(User user);

    User getById(Integer id);

    List<User> getAll();

    void delete(Integer id);

    User userUpdate(Integer id, UserUpdateDto userDto);

    Page<User> getAllByPageAndSize(Integer page, Integer size);
}
