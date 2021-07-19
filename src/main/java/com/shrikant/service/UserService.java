package com.shrikant.service;

import com.shrikant.entity.User;
import com.shrikant.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public int saveUser(User user){
        return userRepository.save(user).getId();
    }

    public User getUser(int id) {
        return userRepository.findById(id);
    }
}
