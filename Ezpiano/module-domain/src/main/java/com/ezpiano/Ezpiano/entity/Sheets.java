package com.ezpiano.Ezpiano.entity;

import lombok.Data;

@Data
public class Sheets {
    private int sheet_id;
    private String title;
    private String last_played;
    private boolean status;
    private String img_url;
    private String created_At;
    private int practiceSum;
    private String description;


    private String directoryID; // 나중에 fk 변경, fk 안쓰고
    private String user_id; // fk
}
