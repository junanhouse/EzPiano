package com.ezpiano.Ezpiano.dto.Sheets;
import lombok.Builder;
import lombok.Data;
import java.util.List;

@Data
@Builder
public class SheetListDto<T> {
    private int sheetId;
    private String title;
    private String lastPlayed;
    private boolean status;
    private int practiceSum;
    private List<T> tags;

}
