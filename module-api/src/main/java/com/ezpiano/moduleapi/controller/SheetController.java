package com.ezpiano.moduleapi.controller;

import com.ezpiano.Ezpiano.dto.Sheets.SheetDetailDefaultRes;
import com.ezpiano.Ezpiano.dto.Sheets.SheetListDefaultRes;
import com.ezpiano.Ezpiano.entity.Sheets;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sheets")
public class SheetController {

    @GetMapping("/")
    public SheetListDefaultRes sheetList(@RequestParam(value = "status") boolean status,
                                                 @RequestParam(value = "tag-dir") String tag_dir,
                                                 @RequestParam(value = "directory-id") String directoryId,
                                                 @RequestParam(value = "count") int page
                                           ){
        return SheetListDefaultRes.res(page, true);
    }

    @GetMapping("/{sheet_id}")
    public SheetDetailDefaultRes sheetDetail(@PathVariable(value = "sheet_id") String sheetId){

        return SheetDetailDefaultRes.res(true, null);
    }

    @PostMapping("/")
    public void sheetCreate(@RequestBody Sheets sheet){

    }
}
