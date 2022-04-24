package com.ltw.online_store.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }

    @GetMapping("/user_home")
    public String homePage(){
        return "web/home";
    }

}
