package com.codegymdanang.casestudy.config;

import com.codegymdanang.casestudy.entity.Role;
import com.codegymdanang.casestudy.entity.User;
import com.codegymdanang.casestudy.repository.RoleRepository;
import com.codegymdanang.casestudy.repository.UserRepository;
import com.codegymdanang.casestudy.utils.EncryptPasswordUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.HashSet;

@Component
public class DataSeedingListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        if (roleRepository.findByName("ROLE_ADMIN")==null){
            roleRepository.save(new Role("ROLE_ADMIN"));
        }

        if (roleRepository.findByName("ROLE_MEMBER")==null){
            roleRepository.save(new Role("ROLE_MEMBER"));
        }

        if (userRepository.findByEmail("haitan@gmail.com") == null){
            User admin = new User();
            admin.setEmail("admin@gmail.com");
            admin.setPassword(EncryptPasswordUtils.EncryptPasswordUtils("123456"));
            HashSet<Role> roles = new HashSet<>();
            roles.add(roleRepository.findByName("ROLE_ADMIN"));
            roles.add(roleRepository.findByName("ROLE_MEMBER"));
            admin.setRoles(roles);
            userRepository.save(admin);
        }

        if (userRepository.findByEmail("member@gmail.com") == null){
            User user = new User();
            user.setEmail("member@gmail.com");
            user.setPassword(EncryptPasswordUtils.EncryptPasswordUtils("123456"));
            HashSet<Role> roles = new HashSet<>();
            roles.add(roleRepository.findByName("ROLE_MEMBER"));
            user.setRoles(roles);
            userRepository.save(user);
        }
    }
}
