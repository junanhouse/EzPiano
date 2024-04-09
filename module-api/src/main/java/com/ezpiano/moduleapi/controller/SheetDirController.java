package com.ezpiano.moduleapi.controller;

import com.ezpiano.Ezpiano.dto.SheetDir.CreateSheetDirReq;
import com.ezpiano.Ezpiano.dto.SheetDir.CreateSheetDirRes;
import com.ezpiano.Ezpiano.dto.SheetDir.SheetDirDetailRes;
import com.ezpiano.Ezpiano.dto.SheetDir.SheetDirListRes;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sheet-dir")
public class SheetDirController {

    @GetMapping()
    public SheetDirListRes sheetDirList(@RequestParam("page") int page) {
        SheetDirListRes sheetDirListRes = new SheetDirListRes();
        return sheetDirListRes;
    }

    @GetMapping("/{id}")
    public SheetDirDetailRes sheetDirDetail(@PathVariable("id") String sheetDirId){
        SheetDirDetailRes sheetDirDetailRes = new SheetDirDetailRes();
        return sheetDirDetailRes;
    }

    @PostMapping()
    public CreateSheetDirRes createSheetDir(@RequestBody CreateSheetDirReq createSheetDirReq){
        CreateSheetDirRes createSheetDirRes = new CreateSheetDirRes();
        return createSheetDirRes;
    }
}
