package com.ezpiano.moduleapi.controller;

import com.ezpiano.Ezpiano.dto.SheetDir.CreateSheetDirReq;
import com.ezpiano.Ezpiano.dto.SheetDir.SheetDirRes;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sheet-dir")
public class SheetDirController {

    @GetMapping()
    public SheetDirRes sheetDirList(@RequestParam("page") String page) {
        //SheetDir data = sheetDirService.findAll()
        //data -> SheetListDto
        return SheetDirRes.res(Integer.parseInt(page), true, "data");

    }

    @GetMapping("/{id}")
    public SheetDirRes sheetDirDetail(@PathVariable("id") String sheetDirId){
        // SheetDir sheetDir = sheetDirService.findById(sheetDirId)
        // Sheet sheet = sheetService.findBysheetDirId(sheetDirId)
        // sheetDir, sheet -> SheetDetailDto --> 뭔가 비효율적인거 같은데....

        // case 1)SheetDirRes data = sheetSheetDirService(sheetDirId)
        return SheetDirRes.res(true, "data");
    }

    @PostMapping()
    public SheetDirRes createSheetDir(@RequestBody CreateSheetDirReq createSheetDirReq){
        // createDirReq.toEntity()
        // save()
        // data = get sheetDirList(page = 1)
        return SheetDirRes.res(true, "data");

    }
}
