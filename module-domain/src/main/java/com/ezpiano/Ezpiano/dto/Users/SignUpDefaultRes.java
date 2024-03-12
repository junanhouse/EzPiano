package com.ezpiano.Ezpiano.dto.Users;

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
