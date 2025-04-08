package ru.kata.boot_security.service;

import ru.kata.boot_security.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void add(User user);

    void update(int id, User user);

    void delete(int id);

    List<User> findAll();

    User findById(int id);

    Optional<User> findByEmail(String email);
}
