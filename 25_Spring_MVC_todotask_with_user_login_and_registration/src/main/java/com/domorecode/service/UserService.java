package com.domorecode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domorecode.entity.UserEntity;
import com.domorecode.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserEntity loginUser(String email, String password) {
        return userRepository.findByUEmailAndUPassword(email, password);
    }

    public void registerUser(UserEntity user) {
        userRepository.save(user);
    }
}
