package com.ezpiano.moduleapi.ControllerTest;

import com.ezpiano.Ezpiano.dto.Users.LoginReq;
import com.ezpiano.Ezpiano.dto.Users.SignUpDefaultReq;
import com.ezpiano.moduleapi.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Test
    public void login() throws Exception {
        LoginReq req = new LoginReq("testId", "hashed");
        when(userService.login("testId", "hased")).thenReturn("testId");
        mockMvc.perform(post("/auth/login")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(new ObjectMapper().writeValueAsString(req)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.token").value("testId"));

     }
    @Test
    public void signUp() throws Exception{
        SignUpDefaultReq req = new SignUpDefaultReq("testId", "hased", "test@test.com",
                "hashed", "20240305");

        mockMvc.perform(post("/auth/signup")
                .contentType(MediaType.APPLICATION_JSON)
                .content(new ObjectMapper().writeValueAsString(req)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true));
    }

}
