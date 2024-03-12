package com.ezpiano.moduleweb;

import com.ezpiano.Ezpiano.dto.Users.SignUpDefaultReq;
import com.ezpiano.Ezpiano.dto.Users.SignUpDefaultRes;
import com.ezpiano.moduleapi.service.UserService;
import com.ezpiano.moduleweb.Users.UserController;
import com.google.gson.Gson;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ExtendWith(MockitoExtension.class)
public class UserControllerTest {

    @InjectMocks
    private UserController userController;

    @Mock
    private UserService userService;

    private MockMvc mockMvc;

    @BeforeEach
    public void init() {
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
    }

    private SignUpDefaultRes signUpRes() {
        return SignUpDefaultRes.builder()
                .success(true)
                .build();
    }
    private SignUpDefaultReq signUpReq() {
        return SignUpDefaultReq.builder()
                .userId("test")
                .username("testname")
                .password("testpassword")
                .email("testemail")
                .createdAt("20240308")
                .build();
    }

    @Test
    void signUpSuccess() throws Exception {
        SignUpDefaultRes res = signUpRes();
        SignUpDefaultReq req = signUpReq();

        Mockito.doReturn(res).when(userService)
                .save(Mockito.any(SignUpDefaultReq.class));

        mockMvc.perform(MockMvcRequestBuilders.post("/auth/signup")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new Gson().toJson(req))
        );




    }

}
