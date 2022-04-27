package com.ltw.online_store.Service.Bus;

import com.ltw.online_store.Entity.Role;
import com.ltw.online_store.Repository.RoleRepository;
import com.ltw.online_store.Service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;


    @Override
    public Set<Role> getRoleAdmins() {
        Set<Role> roles = new HashSet<Role>();
        roles.add(roleRepository.findByRoleName("ROLE_ADMIN"));
        return roles;
    }

    @Override
    public Set<Role> getRoleUsers() {
        Set<Role> roles = new HashSet<Role>();
        roles.add(roleRepository.findByRoleName("ROLE_USER"));
        return roles;
    }

    @Override
    public List<Role> getAll() {
        return roleRepository.findAll();
    }

}
