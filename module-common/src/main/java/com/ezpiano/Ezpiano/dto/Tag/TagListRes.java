package com.ezpiano.Ezpiano.dto.Tag;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class TagListRes<T>{
    private int page;
    private boolean success;
    private T data;
}
