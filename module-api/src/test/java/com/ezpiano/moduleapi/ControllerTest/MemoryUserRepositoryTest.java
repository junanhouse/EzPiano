package com.ezpiano.moduleapi.ControllerTest;

import com.ezpiano.Ezpiano.entity.User;
import com.ezpiano.moduleapi.repository.Users.MemoryUserRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class MemoryUserRepositoryTest {
    @Mock
    MemoryUserRepository repository;

    @BeforeEach
    public void beforeEach() {
        MockitoAnnotations.initMocks(this);
    }
    @AfterEach
    public void afterEach() {
        repository.clearStore();
    }
    @Test
    public void save() {
        User user = mock(User.class);

        repository.save(user);

        User result = repository.findById(user.getUserId()).get();
        assertThat(user).isEqualTo(result);
    }

    @Test
    public void findById() {
        //User user = new User();
        //user.setUserId("userid");
        //user.setEmail("user@user.com");
        //user.setPassword("hashed");
        //user.setUsername("username");
        //user.setCreatedAt("20240101");


        //repository.save(user);

        //User result = repository.findById("userid").get();
        //assertThat(result).isEqualTo(user);
    }

    @Test
    public void findAll() {
        List<User> result = repository.findAll();
        assertThat(result.size()).isEqualTo(2);

    }

}
