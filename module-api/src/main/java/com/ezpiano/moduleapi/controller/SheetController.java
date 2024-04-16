package com.ezpiano.moduleapi.controller;

import com.ezpiano.Ezpiano.dto.Sheets.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sheets")
public class SheetController {

    @GetMapping()
    public SheetRes sheetList(@RequestBody SheetListParam sheetListReq
                                         ){

        // TagSheetRNTN data = tagSheetService.findAll(sheetListReq)
        // data -> SheetListDto
        return SheetRes.of(sheetListReq.getPage(), true, "data");

    }

    @GetMapping("/{id}")
    public SheetRes sheetDetail(@PathVariable("id") String sheetId){
        // SheetDetailDto data = tagSheetService.findByOne(sheetId)
       return SheetRes.of(true, "data");
    }

    @PostMapping()
    public void createSheet(@RequestBody CreateSheetReq createSheetReq){
        // List<Objects> o = createSheetReq.getTags();
        // tagSheetService.create(o, createSheetReq.toEntity)

    }
}
