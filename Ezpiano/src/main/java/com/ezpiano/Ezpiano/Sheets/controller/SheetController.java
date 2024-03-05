package com.ezpiano.Ezpiano.Sheets.controller;

import com.ezpiano.Ezpiano.Sheets.dto.SheetDetailDefaultRes;
import com.ezpiano.Ezpiano.Sheets.dto.SheetListDefaultRes;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sheets")
public class SheetController {

    @GetMapping("/")
    public SheetListDefaultRes sheetList(@RequestParam(value = "status") boolean status,
                                         @RequestParam(value = "tag-dir") String tag_dir,
                                         @RequestParam(value = "directory-id") String directory_id,
                                         @RequestParam(value = "count") int page
                                         ){


        return SheetListDefaultRes.res(page, true); //
    }

    @GetMapping("/{sheet_id}")
    public SheetDetailDefaultRes sheetDeatil(@PathVariable(value = "sheet_id") String sheet_id){


        return SheetDetailDefaultRes.res(true, null);
    }


}
