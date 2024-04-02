package com.ezpiano.moduleapi;

import com.ezpiano.Ezpiano.dto.Users.LoginDefaultRes;
import com.ezpiano.Ezpiano.dto.Users.LoginReq;
import com.ezpiano.Ezpiano.dto.Users.SignUpDefaultReq;
import com.ezpiano.Ezpiano.entity.Sheets;
import com.ezpiano.Ezpiano.entity.User;
import com.ezpiano.moduleapi.controller.UserController;
import com.ezpiano.moduleapi.repository.Users.UserRepository;
import com.ezpiano.moduleapi.service.UserService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.assertThat;
@ExtendWith(MockitoExtension.class)
public class UserControllerTest {

    @Mock
    private UserService userService;

    @InjectMocks
    private UserController userController;

    @Test
    public void login() {
        LoginReq req = new LoginReq("testId", "hashed");
        when(userService.login(req.getUserId(), req.getPassword())).thenReturn(req.getUserId());

        LoginDefaultRes res = userController.login(req);

        assertThat(res.getToken()).isEqualTo("token");
    }

    @Test
    public void signUp(){
        SignUpDefaultReq req = new SignUpDefaultReq("testId", "testusername", "test@test.com",
                "hashed", "20240331");


        when(userService.findById(req.getUserId())).thenReturn();
        userController.signUp(req);


        assertThat(result.size()).isEqualTo(1);


    }

}
