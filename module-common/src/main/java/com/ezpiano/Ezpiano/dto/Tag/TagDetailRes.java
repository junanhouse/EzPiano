package com.ezpiano.Ezpiano.dto.Tag;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder

public class TagDetailRes<T> {
    private boolean success;
    private T data;
}
