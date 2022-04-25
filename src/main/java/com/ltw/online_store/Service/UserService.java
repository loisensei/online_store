package com.ltw.online_store.Service;

import com.ltw.online_store.Entity.User;

public interface UserService {
    User findByUserName(String userName);
}
