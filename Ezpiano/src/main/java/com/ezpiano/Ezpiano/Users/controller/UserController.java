package com.ezpiano.Ezpiano.Users.controller;

import com.ezpiano.Ezpiano.Users.domain.User;
import com.ezpiano.Ezpiano.Users.dto.LoginDefaultRes;
import com.ezpiano.Ezpiano.Users.dto.LoginReq;
import com.ezpiano.Ezpiano.Users.dto.SignUpDefaultRes;
import com.ezpiano.Ezpiano.Users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auth")
public class UserController {
    private UserService userService;
    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/login")
    public LoginDefaultRes login(@RequestBody LoginReq loginReq) {
        userService.login(loginReq.getUser_id(), loginReq.getPassword());
        return LoginDefaultRes.res(); // Response Entity
    }

    @GetMapping("/list") // 테스트용 임시 메소드
    public List<User> listUsers() {
        return userService.findAll();
    }

    @PostMapping("/signup")
    public SignUpDefaultRes signUp(@RequestBody User user) {
        userService.save(user);
        return SignUpDefaultRes.res();
    }


}
