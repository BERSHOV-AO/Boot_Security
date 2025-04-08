package ru.kata.boot_security.service;

import ru.kata.boot_security.model.Role;

import java.util.List;

public interface RoleService {

    List<Role> findAll();

    void add(Role role);

    Role findByName(String name);
}
