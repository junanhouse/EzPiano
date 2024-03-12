package com.ezpiano.moduleweb.Users;

import com.ezpiano.Ezpiano.dto.Users.LoginDefaultRes;
import com.ezpiano.Ezpiano.dto.Users.LoginReq;
import com.ezpiano.Ezpiano.dto.Users.SignUpDefaultReq;
import com.ezpiano.Ezpiano.dto.Users.SignUpDefaultRes;
import com.ezpiano.Ezpiano.entity.User;
import com.ezpiano.moduleapi.service.UserService;
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
        userService.login(loginReq.getUserId(), loginReq.getPassword());
        return LoginDefaultRes.res(); // Response Entity
    }

    @GetMapping("/list") // 테스트용 임시 메소드
    public List<User> listUsers() {
        return userService.findAll();
    }

    @PostMapping("/signup")
    public SignUpDefaultRes signUp(@RequestBody SignUpDefaultReq signUpDefaultReq) {
        userService.save(signUpDefaultReq);
        return SignUpDefaultRes.res();
    }


}
