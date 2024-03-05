package com.ezpiano.Ezpiano.Users.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginReq {
    private String user_id;
    private String password;

    public LoginReq toEntity() {
        return LoginReq.builder()
                .user_id(this.user_id)
                .password(this.password)
                .build();
    }


}
