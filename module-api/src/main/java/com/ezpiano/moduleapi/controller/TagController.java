package com.ezpiano.moduleapi.controller;

import com.ezpiano.Ezpiano.dto.Tag.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tag")
public class TagController {

    @GetMapping()
    public TagListRes tagList(@RequestParam("page") int page){
        TagListRes tagListRes = new TagListRes(1, true, null);
        return tagListRes;
    }
    @GetMapping("/tag/{id}")
    public TagDetailRes tagDetail(@PathVariable("id") String tagId){
        TagDetailRes tagDetailRes = new TagDetailRes(true, null);
        return tagDetailRes;
    }


    @PostMapping()
    public CreateTagRes createTag(@RequestBody CreateTagReq createTagReq){
        CreateTagRes createTagRes = new CreateTagRes(true, null);
        return createTagRes;

    }
}
