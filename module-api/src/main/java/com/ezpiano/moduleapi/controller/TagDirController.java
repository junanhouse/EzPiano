package com.ezpiano.moduleapi.controller;

import com.ezpiano.Ezpiano.dto.TagDir.CreateTagDirReq;
import com.ezpiano.Ezpiano.dto.TagDir.CreateTagDirRes;
import com.ezpiano.Ezpiano.dto.TagDir.TagDirDetailRes;
import com.ezpiano.Ezpiano.dto.TagDir.TagDirListRes;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tag-dir")
public class TagDirController {

    @GetMapping()
    public TagDirListRes tagDirList(@RequestParam("page") int page){
        TagDirListRes tagDirListRes = new TagDirListRes(1, true, null);
        return tagDirListRes;
    }

    @PostMapping()
    public CreateTagDirRes createTagDir(@RequestBody CreateTagDirReq createTagDirReq){
        CreateTagDirRes createTagDirRes = new CreateTagDirRes();
        return createTagDirRes;
    }

    @GetMapping("/{id}")
    public TagDirDetailRes tagDirDetail(@PathVariable("id") String tagDirectoryId){
        TagDirDetailRes tagDirDetailRes = new TagDirDetailRes(true, null);
        return tagDirDetailRes;
    }
}
