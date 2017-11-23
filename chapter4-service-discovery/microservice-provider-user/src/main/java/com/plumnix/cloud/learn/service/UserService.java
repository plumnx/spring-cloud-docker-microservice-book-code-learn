package com.plumnix.cloud.learn.service;

import com.plumnix.cloud.learn.entity.User;
import com.plumnix.cloud.learn.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findById(Long id) {
        return userRepository.findOne(id);
    }

}
