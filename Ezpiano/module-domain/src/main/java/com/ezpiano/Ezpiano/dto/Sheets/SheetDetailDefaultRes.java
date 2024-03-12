package com.ezpiano.Ezpiano.dto.Sheets;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class SheetDetailDefaultRes<T> {
    private boolean success;
    private T data;

    public SheetDetailDefaultRes(boolean success){
        this.success = success;
        data = null;
    }

    public static<T> SheetDetailDefaultRes<T> res(final boolean success){
        return res(success, null);
    }
    public static<T> SheetDetailDefaultRes<T> res(final boolean success, final T data){
        return SheetDetailDefaultRes.<T>builder()
                .success(success)
                .data(data)
                .build();

    }

}
