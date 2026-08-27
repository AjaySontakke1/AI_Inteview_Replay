package com.ajay.aiinterviewreplay.service;

import com.ajay.aiinterviewreplay.entity.User;
import com.ajay.aiinterviewreplay.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }
}
