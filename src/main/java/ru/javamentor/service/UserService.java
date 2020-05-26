package ru.javamentor.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.javamentor.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {

    List<User> listOfUsers();

    boolean addUser(User user);

    void deleteUser(Long id);

    void updateUser(User user);

    boolean isUserExist(User user);
}
