package com.ltw.online_store.validator;

import com.ltw.online_store.Entity.User;
import com.ltw.online_store.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.util.regex.Pattern;

@Component
public class UserValidator implements Validator {
    @Autowired
    private UserService userService;

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user = (User) target;
        ValidationUtils.rejectIfEmpty(errors, "email", "error.email","please fill in Email field!");
        ValidationUtils.rejectIfEmpty(errors,"userName","error.userName","please fill in UserName field!");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPassword", "error.confirmPassword", "please fill in confirmPassword field");
        Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

        if (!(pattern.matcher(user.getEmail()).matches())) {
            errors.rejectValue("email", "error.email", "Email address does not match!");
        }

        if (userService.findByUserName(user.getUserName()) != null){
            errors.rejectValue("userName","error.userName","This e-mail is already taken!");
        }

        if (user.getPassword().length() < 3 || user.getPassword().length() > 32) {
            errors.rejectValue("password", "error.password", "password must be 3 to 32 characters long!");
        }

        if (!user.getConfirmPassword().equals(user.getPassword())) {
            errors.rejectValue("confirmPassword", "error.confirmPassword", "Confirmation password is incorrect!");
        }

    }
}
