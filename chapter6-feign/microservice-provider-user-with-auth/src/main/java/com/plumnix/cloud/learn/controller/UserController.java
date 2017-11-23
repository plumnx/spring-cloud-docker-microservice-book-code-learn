package com.plumnix.cloud.learn.controller;

import com.plumnix.cloud.learn.entity.User;
import com.plumnix.cloud.learn.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class UserController {

    public static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if(principal instanceof UserDetails) {
            UserDetails user = (UserDetails) principal;
            Collection<? extends GrantedAuthority> collection = user.getAuthorities();
            for (GrantedAuthority grantedAuthority : collection) {
                logger.info("当前用户是{}，角色是{}", user.getUsername(), grantedAuthority.getAuthority());
            }
        } else {
            // do other things
        }
        return userService.findById(id);
    }

}
