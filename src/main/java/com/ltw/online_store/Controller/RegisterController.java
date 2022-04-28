package com.ltw.online_store.Controller;

import javax.validation.Valid;
import com.ltw.online_store.Entity.User;
import com.ltw.online_store.Service.SecurityService;
import com.ltw.online_store.Service.UserService;
import com.ltw.online_store.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;

    @GetMapping("/register")
    public String registerPage(Model model){
        model.addAttribute("newUser",new User());
        return "register";
    }

    @PostMapping("/register")
    public String registerProcess(@ModelAttribute("newUser") @Valid User user, BindingResult bindingResult, Model model) {

         userValidator.validate(user, bindingResult);

        if (bindingResult.hasErrors()) {
            return "register";
        }
        System.out.println(user);
        userService.saveUser(user);

        securityService.autoLogin(user.getUserName(), user.getPassword());

        return "redirect:/";
    }

}
