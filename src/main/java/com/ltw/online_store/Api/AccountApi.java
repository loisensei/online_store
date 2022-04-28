package com.ltw.online_store.Api;

import com.ltw.online_store.Dto.UserDto;
import com.ltw.online_store.Entity.User;
import com.ltw.online_store.Service.RoleService;
import com.ltw.online_store.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@SessionAttributes("loggerInUser")
@RequestMapping("/api/account")
public class AccountApi {
    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @DeleteMapping("/delete/{id}")
    public void deleteAccountById(@PathVariable Long id, Model model){
        userService.deleteById(id);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> getAccountById(@PathVariable Long id, Model model){
        return ResponseEntity.ok(userService.getById(id));
    }

    @PostMapping("/update")
    public void updateAccount(@RequestBody UserDto user, Model model){
        model.addAttribute("loggerInUser",user);
        userService.updateUser(user);
    }
}
