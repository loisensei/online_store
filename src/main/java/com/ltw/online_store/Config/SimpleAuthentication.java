package com.ltw.online_store.Config;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

@Component
public class SimpleAuthentication implements AuthenticationSuccessHandler {
    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
            throws IOException, ServletException {
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        authorities.forEach(authority -> {
            if(authority.getAuthority().equals("USER")) {
                try {
                    redirectStrategy.sendRedirect(request,response,"/user_home");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(authority.getAuthority().equals("ADMIN")){
                try {
                    redirectStrategy.sendRedirect(request,response,"/admin_home");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else{
                throw  new IllegalStateException();
            }
        });
    }
}
