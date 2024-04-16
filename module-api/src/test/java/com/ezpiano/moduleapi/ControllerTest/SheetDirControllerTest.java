package com.ezpiano.moduleapi.ControllerTest;

import com.ezpiano.Ezpiano.dto.SheetDir.CreateSheetDirReq;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
@SpringBootTest
@AutoConfigureMockMvc
public class SheetDirControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void sheetDirList() throws Exception{
        mockMvc.perform(get("/sheet-dir")
                        .param("page", "1")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.success").value(true));

    }

    @Test
    public void sheetDirDetail() throws Exception{
        mockMvc.perform(get("/sheet-dir/1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.success").value(true));

    }

    @Test
    public void sheetDirCreate() throws Exception{
        CreateSheetDirReq createSheetDirReq = CreateSheetDirReq.builder()
                .directoryName("test")
                .build();

        mockMvc.perform(post("/sheet-dir")
                .contentType(MediaType.APPLICATION_JSON)
                .content(new ObjectMapper().writeValueAsString(createSheetDirReq)))
                .andExpect(jsonPath("$.success").value(true));

    }
}
