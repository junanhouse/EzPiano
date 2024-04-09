package com.ezpiano.Ezpiano.dto.Sheets;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class CreateSheetReq<T> {
    private String title;
    private boolean status;
    private String description;
    private String directory_id;
    private List<String> tags;
}
