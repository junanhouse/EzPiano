package com.ezpiano.Ezpiano.Users.service;

import com.ezpiano.Ezpiano.Users.domain.User;
import com.ezpiano.Ezpiano.Users.repository.MemoryUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    public final MemoryUserRepository memoryUserRepository;

    @Autowired
    public UserService(MemoryUserRepository memoryUserRepository){
        this.memoryUserRepository = memoryUserRepository;
    }

    public void save(User user) {
        memoryUserRepository.save(user);
    }

    public Optional<User> findById(String user_id) {
        return memoryUserRepository.findById(user_id);
    }

    public List<User> findAll(){ return memoryUserRepository.findAll(); }

    public String login(String user_id, String password) {

        validateDuplicateLogin(user_id, password);
        return user_id;

    }

    private User validateDuplicateLogin(String user_id, String password) {
        return memoryUserRepository.login(user_id, password)
                .orElseThrow(() -> {
                    throw new IllegalStateException("아이디와 패스워드가 맞지 않습니다.");
                });
    }

}
