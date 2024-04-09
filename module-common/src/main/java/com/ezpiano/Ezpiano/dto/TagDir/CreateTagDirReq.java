package com.ezpiano.Ezpiano.dto.TagDir;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class CreateTagDirReq {
    private String tagDirId;
}
