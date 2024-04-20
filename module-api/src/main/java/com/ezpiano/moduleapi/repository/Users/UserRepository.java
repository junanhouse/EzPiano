package com.ezpiano.moduleapi.repository.Users;

import com.ezpiano.Ezpiano.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

    User save(User user);
    List<User> findAll();
    Optional<User> login(String id, String password);
    Optional<User> findById(String id);
}
