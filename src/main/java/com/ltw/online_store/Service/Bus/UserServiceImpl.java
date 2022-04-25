package com.ltw.online_store.Service.Bus;

import com.ltw.online_store.Entity.User;
import com.ltw.online_store.Repository.UserRepository;
import com.ltw.online_store.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public User findByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }
}
