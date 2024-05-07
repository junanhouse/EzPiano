package com.ezpiano.Ezpiano.dto.Sheets;

import com.ezpiano.Ezpiano.entity.Tag;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class SheetDetailDto<T> {
    private int sheetId;
    private String title;
    private String lastPlayed;
    private boolean status;
    private String imgUrl;
    private String createdAt;
    private int practiceSum;
    private String description;
    private String directoryId;
    private List<Tag> tags;

}
