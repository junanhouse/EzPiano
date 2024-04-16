package com.ezpiano.moduleapi.controller;

import com.ezpiano.Ezpiano.dto.Tag.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tag")
public class TagController {

    @GetMapping()
    public TagRes tagList(@RequestParam("page") int page){
        // List<Tag> tags = tagService.findAll(page);
        // TagDto data = new TagDto.of(tags) <<<< List

        return TagRes.res("data", true, page);
    }
    @GetMapping("/tag/{id}")
    public TagRes tagDetail(@PathVariable("id") String tagId){
        // Tag tag = tagService.findById(tagId)
        // TagDto data = new TagDto.of(tag) --> new 사용 x static ?

        return TagRes.res("data", true);
    }


    @PostMapping()
    public TagRes createTag(@RequestBody CreateTagReq createTagReq){
        // Tag tag = tagService.create(createTagReq)
        // TagDot data = new TagDto.of(tag)
        return TagRes.res("data", true);

    }
}
