package com.ezpiano.Ezpiano.Users.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class SignUpDefaultRes {
    Boolean success;

    public static SignUpDefaultRes res() {
        return SignUpDefaultRes.builder()
                .success(true)
                .build();
    }
}
