package com.taffy.music.services;
import com.taffy.music.domain.users;
import com.taffy.music.repositories.UserRepositories;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final UserRepositories userRepository;

    public UserService(UserRepositories userRepository) {
        this.userRepository = userRepository;
    }

    // 创建用户
    public users createUser(users user) {
        return userRepository.save(user);
    }

    // 获取用户信息
    public Optional <users> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // 删除用户
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
