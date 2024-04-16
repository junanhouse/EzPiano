package com.ezpiano.moduleapi.ControllerTest;

import com.ezpiano.Ezpiano.dto.Sheets.CreateSheetReq;
import com.ezpiano.Ezpiano.dto.Sheets.SheetListParam;
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
public class SheetControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void sheetList() throws Exception{
        SheetListParam sheetListParam = SheetListParam.builder()
                .page(1)
                .build();

        mockMvc.perform(get("/sheets")
                .contentType(MediaType.APPLICATION_JSON)
                .content(new ObjectMapper().writeValueAsString(sheetListParam)))
                .andExpect(jsonPath("$.success").value(true));
    }

    @Test
    public void sheetDeatil() throws Exception{
        mockMvc.perform(get("/sheets/1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.success").value(true));

    }

    @Test
    public void sheetCreate() throws Exception{
        CreateSheetReq createSheetReq = CreateSheetReq.builder()
                .title("title")
                .description("test")
                .imgUrl("url.com")
                .status(false)
                .userId("testId")
                .build();
        mockMvc.perform(post("/sheets")
                .contentType(MediaType.APPLICATION_JSON)
                .content(new ObjectMapper().writeValueAsString(createSheetReq)))
                .andExpect(jsonPath("$.success").value(true));
    }
}
