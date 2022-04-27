package com.ltw.online_store.Service.Bus;

import com.ltw.online_store.Entity.Role;
import com.ltw.online_store.Entity.User;
import com.ltw.online_store.Repository.RoleRepository;
import com.ltw.online_store.Repository.UserRepository;
import com.ltw.online_store.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private RoleRepository roleRepository;


    @Override
    public User findByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }

    @Override
    public void saveUser(User user) {
        Set<Role> roles = new HashSet<Role>();
        roles.add(roleRepository.findByRoleName("ROLE_USER"));
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRole(roles);

        userRepository.save(user);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }


}
