package com.ltw.online_store.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    @GetMapping("/admin_home")
    public String homePage(){
        return "admin/home";
    }
}
