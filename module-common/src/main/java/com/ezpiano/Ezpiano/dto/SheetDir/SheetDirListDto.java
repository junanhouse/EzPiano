package com.ezpiano.Ezpiano.dto.SheetDir;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class SheetDirListDto {
    private int page;
    private boolean success;
    private String directoryName;
    private int directoryId;
    private List<String> childDirectoryId;
}
