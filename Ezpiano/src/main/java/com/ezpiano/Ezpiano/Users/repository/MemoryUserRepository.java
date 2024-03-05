package com.ezpiano.Ezpiano.Users.repository;

import com.ezpiano.Ezpiano.Users.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class MemoryUserRepository implements UserRepository{
    private static Map<Long, User> store = new ConcurrentHashMap<>();
    private static long sequence = 0L;

    @Override
    public User save(User user) {
        user.setId(++sequence);
        store.put(user.getId(), user);
        return user;
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(store.values());
    }

    @Override
    public Optional<User> login(String id, String password) { // 나중에 변경, 임시
        return store.values().stream()
                .filter(user -> user.getUser_id().equals(id))
                .filter(user -> user.getPassword().equals(password))
                .findAny();
    }

    @Override
    public Optional<User> findById(String id){
        return store.values().stream()
                .filter(user -> user.getUser_id().equals(id))
                .findAny();
    }


    public void clearStore() {
        store.clear();
    }
}
