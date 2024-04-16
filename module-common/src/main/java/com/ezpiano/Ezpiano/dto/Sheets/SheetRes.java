package com.ezpiano.Ezpiano.dto.Sheets;

import lombok.*;

import java.util.Optional;


@Data
@Builder
@AllArgsConstructor
public class SheetRes<T> {
    private T data;
    private boolean success;
    private int page;

    public static<T> SheetRes of(boolean success, T data){
        return of(1, true, data);
    }

    public static<T> SheetRes of(int page, boolean success, T data){
        return SheetRes.<T>builder()
                .page(page)
                .data(data)
                .success(true)
                .build();
    }
}
