package com.ezpiano.Ezpiano.entity;

import lombok.Data;

@Data
public class SheetDir {
    private String directoryId;
    private String directoryName;
    private String parentDirectoryId;
    private String createdAt;
    private String updatedAt;
    private String userId;
}
