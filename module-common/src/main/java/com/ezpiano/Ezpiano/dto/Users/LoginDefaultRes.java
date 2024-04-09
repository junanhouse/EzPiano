package com.ezpiano.Ezpiano.dto.Users;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class LoginDefaultRes {
    private Integer expires_in;
    private String token;

    public static LoginDefaultRes res(String token) {
        return LoginDefaultRes.builder()
                .token(token)
                .expires_in(36000)
                .build();
    }

}