package ru.kata.boot_security.service;

import org.springframework.stereotype.Service;
import ru.kata.boot_security.dao.RoleRepository;
import ru.kata.boot_security.dao.UserRepository;
import ru.kata.boot_security.model.Role;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class RoleServiceImp implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServiceImp(RoleRepository roleRepository, UserRepository userRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    @Transactional
    @Override
    public void add(Role role) {
        roleRepository.save(role);
    }

    @Override
    public Role findByName(String name) {
        return (Role) roleRepository.findByName(name);
    }
}
