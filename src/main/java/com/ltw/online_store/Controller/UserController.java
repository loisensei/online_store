package com.ltw.online_store.Controller;

import com.ltw.online_store.Entity.User;
import com.ltw.online_store.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.Authenticator;

@Controller
@SessionAttributes("loggerInUser")
public class UserController {

    @Autowired
    private UserService userService;

    @ModelAttribute("loggerInUser")
    public User loggerInUser() {
        Authentication au = SecurityContextHolder.getContext().getAuthentication();
        return userService.findByUserName(au.getName());
    }

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }

    @GetMapping("/user_home")
    public String homePage(){
        return "web/home";
    }

    @GetMapping("/logout")
    public String logoutPage(HttpServletRequest request, HttpServletResponse response){
        Authentication au = SecurityContextHolder.getContext().getAuthentication();
        if(au != null){
            new SecurityContextLogoutHandler().logout(request, response,au);
        }
        return "redirect:/login?logout";
    }

}
