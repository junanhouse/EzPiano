package com.ezpiano.Ezpiano.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private Long id;
    private String userId;
    private String username;
    private String email;
    private String password;
    private String createdAt; // 나중에 Date
}
