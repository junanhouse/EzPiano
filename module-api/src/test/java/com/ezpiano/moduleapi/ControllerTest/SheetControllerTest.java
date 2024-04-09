package com.ezpiano.moduleapi;

import com.ezpiano.Ezpiano.dto.Sheets.SheetListReq;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
@SpringBootTest
@AutoConfigureMockMvc
public class SheetControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void sheetList() throws Exception{
        SheetListReq sheetListReq = new SheetListReq(false, null, null, 1);

        mockMvc.perform(get("/sheets")
                .contentType(MediaType.APPLICATION_JSON)
                .content(new ObjectMapper().writeValueAsString(sheetListReq)))
                .andExpect(jsonPath("$.success").value(true));
    }

    @Test
    public void sheetDeatil() throws Exception{
        mockMvc.perform(get("/sheets/1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.success").value(true));

    }
}
