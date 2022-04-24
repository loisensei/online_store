package com.ltw.online_store.Config;

import com.ltw.online_store.Entity.Role;
import com.ltw.online_store.Entity.User;
import com.ltw.online_store.Repository.RoleRepository;
import com.ltw.online_store.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.HashSet;

@Component
public class DataSeeder implements ApplicationListener<ContextRefreshedEvent> {
   @Autowired
   private UserRepository userRepository;

   @Autowired
   private RoleRepository roleRepository;

   @Autowired
   private BCryptPasswordEncoder passwordEncoder;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        if(roleRepository.findByRoleName("ADMIN") == null){
            roleRepository.save(new Role("ADMIN"));
        }

        if(roleRepository.findByRoleName("USER") == null){
            roleRepository.save(new Role("USER"));
        }

        if(userRepository.findByUserName("admin") == null){
            User user = new User("admin","loitran299@gmail.com", passwordEncoder.encode("123456"));
            HashSet<Role> roles = new HashSet<Role>();
            roles.add(roleRepository.findByRoleName("ADMIN"));
            user.setRole(roles);
            userRepository.save(user);
        }

        if(userRepository.findByUserName("user1") == null){
            User user = new User("user1","user@gmail.com", passwordEncoder.encode("123456"));
            HashSet<Role> roles = new HashSet<Role>();
            roles.add(roleRepository.findByRoleName("USER"));
            user.setRole(roles);
            userRepository.save(user);
        }
    }
}
