package com.ezpiano.Ezpiano.dto.Sheets;

import com.ezpiano.Ezpiano.entity.Sheet;
import com.ezpiano.Ezpiano.entity.TagSheetRNTN;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class CreateSheetReq<T> {
    private String userId;
    private String title;
    private boolean status;
    private String description;
    private String directoryId;
    private String imgUrl;
    @Builder.Default
    private List<T> tags = new ArrayList<>();


    public Sheet toEntity(){
        return Sheet.builder()
                .userId(userId)
                .title(title)
                .status(status)
                .description(description)
                .directoryId(directoryId)
                .imgUrl(imgUrl)
                .build();
    }

}
