package com.ezpiano.Ezpiano.dto.SheetDir;

import com.ezpiano.Ezpiano.dto.Sheets.SheetListDto;
import com.ezpiano.Ezpiano.entity.Sheet;
import com.ezpiano.Ezpiano.entity.SheetDir;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class SheetDirDetailDto {
    private int directoryId;
    private String directoryName;
    private List<String> childDirectoryId;
    private String parentDirectoryId;
    private String createdAt;
    private String updatedAt;
    private List<Sheet> sheets;

    public static SheetDirDetailDto res(SheetDir sheetDir, String userId, List<String> childDirectoryId, List<Sheet> sheets){
        return SheetDirDetailDto.builder()
                .directoryId(sheetDir.getDirectoryId())
                .directoryName(sheetDir.getDirectoryName())
                .childDirectoryId(childDirectoryId)
                .parentDirectoryId(sheetDir.getParentDirectoryId())
                .createdAt(sheetDir.getCreatedAt())
                .updatedAt(sheetDir.getUpdatedAt())
                .sheets(sheets)
                .build();
    } /**
            1. select * from sheetDir (filter : userId, directoryId)
            2. select directoryId from sheetDir ( filter : userId, parentDirectoryId = this.directoryId )
        **/
}
