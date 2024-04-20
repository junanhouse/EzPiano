package com.ezpiano.moduleapi.ControllerTest;

import com.ezpiano.Ezpiano.dto.SheetDir.CreateSheetDirReq;
import com.ezpiano.Ezpiano.dto.Tag.CreateTagReq;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest
@AutoConfigureMockMvc
public class TagControlloerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void tagList() throws Exception{
        mockMvc.perform(get("/tag")
                        .param("page", "1")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.success").value(true));

    }

    @Test
    public void tagDetail() throws Exception{
        mockMvc.perform(get("/tag/1")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.success").value(true));

    }

    @Test
    public void tagCreate() throws Exception{
        CreateTagReq createTagReq = CreateTagReq.builder()
                .color("test")
                .title("title")
                .build();

        mockMvc.perform(post("/tag")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(createTagReq)))
                .andExpect(jsonPath("$.success").value(true));

    }
}
