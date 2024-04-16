package com.ezpiano.Ezpiano.dto.Tag;

import com.ezpiano.Ezpiano.entity.Tag;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class TagDto {
    private String title;
    private String color;

    public TagDto of(Tag tag){
        return TagDto.builder()
                .color(tag.getColor())
                .title(tag.getTitle())
                .build();
    }
}
