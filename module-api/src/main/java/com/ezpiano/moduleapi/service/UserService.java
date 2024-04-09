package com.ezpiano.moduleapi.service;

import com.ezpiano.Ezpiano.dto.Users.SignUpDefaultReq;
import com.ezpiano.Ezpiano.entity.User;
import com.ezpiano.moduleapi.repository.Users.MemoryUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    public final MemoryUserRepository memoryUserRepository;

    @Autowired
    public UserService(MemoryUserRepository memoryUserRepository) { this.memoryUserRepository = memoryUserRepository; }

    public void save(SignUpDefaultReq signUpDefaultReq) {
        memoryUserRepository.save(signUpDefaultReq.toEntity());
    }

    public Optional<User> findById(String userId) {
        return memoryUserRepository.findById(userId);
    }

    public List<User> findAll(){ return memoryUserRepository.findAll(); }

    public String login(String userId, String password) {
        validateDuplicateLogin(userId, password);
        return userId;

    }

    private User validateDuplicateLogin(String user_id, String password) {
        return memoryUserRepository.login(user_id, password)
                .orElseThrow(() -> {
                    throw new IllegalStateException("아이디와 패스워드가 맞지 않습니다.");
                });
    }

}
