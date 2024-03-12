package com.ezpiano.Ezpiano.dto.Users;

import com.ezpiano.Ezpiano.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class SignUpDefaultReq {
    private String userId;
    private String username;
    private String email;
    private String password;
    private String createdAt;

    public User toEntity(){
        return User.builder()
                .userId(this.userId)
                .password(this.password)
                .username(this.username)
                .email(this.email)
                .createdAt(this.createdAt)
                .build();
    }

}
