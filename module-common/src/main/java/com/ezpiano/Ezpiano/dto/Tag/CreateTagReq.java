package com.ezpiano.Ezpiano.dto.Tag;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class CreateTagReq {
    private String title;
    private String color;
}
