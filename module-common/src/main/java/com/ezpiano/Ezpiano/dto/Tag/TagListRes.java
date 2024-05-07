package com.ezpiano.Ezpiano.dto.Tag;

import com.ezpiano.Ezpiano.entity.Tag;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TagListRes {
    private String title;
    private String color;

    public TagDetailRes of(Tag tag){
        return TagDetailRes.builder()
                .color(tag.getColor())
                .title(tag.getTitle())
                .build();
    }
}
