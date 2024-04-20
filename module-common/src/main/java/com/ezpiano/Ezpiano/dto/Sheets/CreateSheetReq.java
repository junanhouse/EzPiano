package com.ezpiano.Ezpiano.Sheets.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class SheetCreateReq<T> {
    private String title;
    private boolean status;
    private String description;
    private String directory_id;
    private List<String> tags;
}
