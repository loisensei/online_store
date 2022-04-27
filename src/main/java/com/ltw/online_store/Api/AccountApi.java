package com.ltw.online_store.Api;

import com.ltw.online_store.Service.RoleService;
import com.ltw.online_store.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/account")
public class AccountApi {
    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

//    @PostMapping("/delete/{id}")
//    public void deleteAccount(@PathVariable Long id, Model model){
//        userService.deleteById(id);
//    }

}
