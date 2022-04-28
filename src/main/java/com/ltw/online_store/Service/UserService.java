package com.ltw.online_store.Service;

import com.ltw.online_store.Dto.UserDto;
import com.ltw.online_store.Entity.User;

import java.util.List;

public interface UserService {
    User findByUserName(String userName);
    void saveUser(User user);
    List<User> getAll();
    void deleteById(Long id);
    User getById(Long id);
    void updateUser(UserDto user);
}
