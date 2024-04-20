package com.ezpiano.Ezpiano.dto.Sheets;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class SheetListReq {
    private boolean status;
    private String tagDir;
    private String directoryId;
    private int page;
}
