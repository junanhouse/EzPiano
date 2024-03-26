package com.ezpiano.Ezpiano.dto.Users;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginReq {
    private String userId;
    private String password;

    public LoginReq toEntity() {
        return LoginReq.builder()
                .userId(this.userId)
                .password(this.password)
                .build();
    }


}
