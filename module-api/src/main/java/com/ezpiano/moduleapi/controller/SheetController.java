package com.ezpiano.moduleapi.controller;

import com.ezpiano.Ezpiano.dto.Sheets.CreateSheetReq;
import com.ezpiano.Ezpiano.dto.Sheets.SheetDetailDefaultRes;
import com.ezpiano.Ezpiano.dto.Sheets.SheetListDefaultRes;
import com.ezpiano.Ezpiano.dto.Sheets.SheetListReq;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sheets")
public class SheetController {

    @GetMapping()
    public SheetListDefaultRes sheetList(@RequestBody SheetListReq sheetListReq
                                         ){
        return SheetListDefaultRes.res(sheetListReq.getPage(), true);
    }

    @GetMapping("/{id}")
    public SheetDetailDefaultRes sheetDetail(@PathVariable("id") String sheetId){

        return SheetDetailDefaultRes.res(true, null);
    }

    @PostMapping()
    public void createSheet(@RequestBody CreateSheetReq createSheetReq){

    }
}
