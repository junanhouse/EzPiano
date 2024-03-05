package com.ezpiano.Ezpiano.User;

import com.ezpiano.Ezpiano.Users.domain.User;
import com.ezpiano.Ezpiano.Users.repository.MemoryUserRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class MemoryUserRepositoryTest {
    MemoryUserRepository repository = new MemoryUserRepository();

    @BeforeEach
    public void beforeEach() {
        User dummy = new User();
        dummy.setUser_id("dummy1");
        dummy.setEmail("dummy1@user.com");
        dummy.setPassword("hashed");
        dummy.setUsername("dummy1");
        dummy.setCreatedAt("20240101");

        User dummy2 = new User();
        dummy2.setUser_id("dummy2");
        dummy2.setEmail("dummy2@user.com");
        dummy2.setPassword("hashed");
        dummy2.setUsername("dummy2");
        dummy2.setCreatedAt("20240101");

        repository.save(dummy);
        repository.save(dummy2);
    }
    @AfterEach
    public void afterEach() {
        repository.clearStore();
    }
    @Test
    public void save() {
        User user = new User();
        user.setUser_id("userid");
        user.setEmail("user@user.com");
        user.setPassword("hashed");
        user.setUsername("username");
        user.setCreatedAt("20240101");

        repository.save(user);

        User result = repository.findById(user.getUser_id()).get();
        assertThat(user).isEqualTo(result);
    }

    @Test
    public void findById() {
        User user = new User();
        user.setUser_id("userid");
        user.setEmail("user@user.com");
        user.setPassword("hashed");
        user.setUsername("username");
        user.setCreatedAt("20240101");


        repository.save(user);

        User result = repository.findById("userid").get();
        assertThat(result).isEqualTo(user);
    }

    @Test
    public void findAll() {
        List<User> result = repository.findAll();
        assertThat(result.size()).isEqualTo(2);

    }

}
