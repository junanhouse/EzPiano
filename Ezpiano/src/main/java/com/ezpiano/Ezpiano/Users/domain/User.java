package com.ezpiano.Ezpiano.Users.domain;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String user_id;
    private String username;
    private String email;
    private String password;
    private String createdAt; // 나중에 Date

}
