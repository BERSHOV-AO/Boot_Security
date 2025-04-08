package ru.kata.boot_security.service;

import org.springframework.stereotype.Service;
import ru.kata.boot_security.model.User;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService {
    @Override
    public void add(User user) {

    }

    @Override
    public void update(int id, User user) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return Optional.empty();
    }
}
