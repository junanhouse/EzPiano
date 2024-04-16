package com.ezpiano.Ezpiano.dto.SheetDir;

import com.ezpiano.Ezpiano.entity.SheetDir;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateSheetDirReq {
    private String directoryName;
    @Builder.Default
    private String parentDirectoryId = "root";

    public SheetDir toEntity(){
        return SheetDir.builder()
                .directoryName(directoryName)
                .parentDirectoryId(parentDirectoryId)
                .build();
    }
}
