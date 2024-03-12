package com.ezpiano.Ezpiano.dto.Sheets;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class SheetListDefaultRes<T> {

    private int count; // page
    private boolean success;
    private T data;

    public SheetListDefaultRes(final int count, final boolean success) {
        this.count = count;
        this.success = success;
        this.data = null;
    }

    public static<T> SheetListDefaultRes<T> res(final int count, final boolean success){
        return res(count, success, null);
    }

    public static<T> SheetListDefaultRes<T> res(final int count, final boolean success, final T t){
        return SheetListDefaultRes.<T>builder()
                .data(t)
                .count(count)
                .success(success)
                .build();
    }
}
