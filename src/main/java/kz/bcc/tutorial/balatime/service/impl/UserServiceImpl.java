package kz.bcc.tutorial.balatime.service.impl;

import kz.bcc.tutorial.balatime.model.User;
import kz.bcc.tutorial.balatime.model.UserUpdateDto;
import kz.bcc.tutorial.balatime.repository.UserRepository;
import kz.bcc.tutorial.balatime.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getById(Integer id) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            return userRepository.findById(id).get();
        } else {
            return null;
        }
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public User userUpdate(Integer id, UserUpdateDto userDto) {
        if(userRepository.existsById(id)){
            User user  =userRepository.findById(id).get();
            user.setLogin(user.getLogin());
            user.setPassword(user.getPassword());
            user = userRepository.saveAndFlush(user);
            return user;
        }
        return null;

    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.getUserByLogin(s);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return user;
    }
}
