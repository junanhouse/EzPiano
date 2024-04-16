package com.ezpiano.Ezpiano.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SheetDir {
    private int directoryId;
    private String directoryName;
    private String parentDirectoryId;
    private String createdAt;
    private String updatedAt;
    private String userId;
}
