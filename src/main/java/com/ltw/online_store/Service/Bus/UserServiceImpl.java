package com.ltw.online_store.Service.Bus;

import com.ltw.online_store.Dto.UserDto;
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
import java.util.Objects;
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
    public boolean nguoiDungTonTai(String username) {
        if(userRepository.findByUserName(username) != null) return true;
        return false;
    }

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

    @Override
    public User getById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public void updateUser(UserDto user) {
        User oldUser = userRepository.findByUserName(user.getUserName());
        if (!Objects.equals(user.getPassword(), "")) {
            oldUser.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        }
        oldUser.setEmail(user.getEmail());
        oldUser.setAddress(user.getAddress());
        oldUser.setFullName(user.getFullName());
        userRepository.save(oldUser);
    }

    @Override
    public void saveUser(UserDto user) {
        User newUser = new User();
        newUser.setUserName(user.getUserName());
        newUser.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        newUser.setEmail(user.getEmail());
        newUser.setAddress(user.getAddress());
        Set<Role> roles = new HashSet<Role>();
        roles.add(roleRepository.findByRoleName(user.getRoleName()));
        newUser.setRole(roles);
        userRepository.save(newUser);
    }


}
