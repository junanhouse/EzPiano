package com.ezpiano.Ezpiano.dto.Tag;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class TagRes<T> {
    private boolean success;
    private int page;
    private T data;

    public static<T> TagRes res(T data, boolean success ){
        return res(data, success, 1);
    }
    public static<T> TagRes res(T data, boolean success, int page){
        return TagRes.builder()
                .data(data)
                .success(success)
                .page(page)
                .build();
    }    //
}

