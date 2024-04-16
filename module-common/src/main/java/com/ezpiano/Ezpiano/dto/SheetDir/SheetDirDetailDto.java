package com.ezpiano.Ezpiano.dto.SheetDir;

import com.ezpiano.Ezpiano.dto.Sheets.SheetListDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class SheetDirDetailDto<T> {
    private int directoryId;
    private String directoryName;
    private List<T> childDirectoryId; // directoryId or directoryName ?
    private String parentDirectoryId;
    private String createdAt;
    private String updatedAt;
    private List<SheetListDto> sheets;

}
