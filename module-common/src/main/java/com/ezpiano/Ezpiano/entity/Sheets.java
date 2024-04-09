package com.ezpiano.Ezpiano.entity;

import lombok.Data;

@Data
public class Sheets {
    private int sheetId;
    private String title;
    private String lastPlayed;
    private boolean status;
    private String imgUrl;
    private String createdAt;
    private int practiceSum;
    private String description;


    private String directoryID; // 나중에 fk 변경, fk 안쓰고
    private String userId; // fk
}
