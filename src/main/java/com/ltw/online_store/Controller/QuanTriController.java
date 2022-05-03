package com.ltw.online_store.Controller;

import com.ltw.online_store.Entity.User;
import com.ltw.online_store.Service.RoleService;
import com.ltw.online_store.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("loggerInUser")
@RequestMapping("/admin")
public class QuanTriController {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @ModelAttribute("loggerInUser")
    public User loggerInUser() {
        Authentication au = SecurityContextHolder.getContext().getAuthentication();
        return userService.findByUserName(au.getName());
    }

    @GetMapping("/admin_home")
    public String homePage(){
        return "admin/home";
    }

    @GetMapping("/profile")
    public String profilePage(){
        return "admin/profile";
    }

    @GetMapping("/brand")
     public String brandPage() {
        return "admin/brand";
    }

    @GetMapping("/account-management")
    public String accountManagementPage(Model model){
        model.addAttribute("users",userService.getAll());
        model.addAttribute("roles",roleService.getAll());
        return "admin/accountManagement";
    }

    @GetMapping("/delete")
    public String deleteAccount(@RequestParam Long id){
        userService.deleteById(id);
        return "redirect:/admin/account-management";
    }
}
