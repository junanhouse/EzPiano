package com.ezpiano.Ezpiano.dto.SheetDir;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SheetDirRes<T> {
    private int page;
    private boolean success;
    private T data;

    public static<T> SheetDirRes res(boolean success, T data) {
        return res(1, success, data);
    }

    public static<T> SheetDirRes res(int page, boolean success, T data){
        return SheetDirRes.<T>builder()
                .page(page)
                .success(success)
                .data(data)
                .build();
    }
}
