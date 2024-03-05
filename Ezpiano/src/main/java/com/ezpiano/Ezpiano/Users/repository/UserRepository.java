package com.ezpiano.Ezpiano.Users.repository;
import com.ezpiano.Ezpiano.Users.domain.User;
import java.util.List;
import java.util.Optional;

public interface UserRepository {
    User save(User user);
    List<User> findAll();
    Optional<User> login(String id, String password);
    Optional<User> findById(String id);
}
