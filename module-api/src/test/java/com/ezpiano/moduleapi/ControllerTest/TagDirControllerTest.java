package com.ezpiano.moduleapi.ControllerTest;

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
public class TagDirControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void TagDirList() throws Exception {
        mockMvc.perform(get("/tag-dir")
                .contentType(MediaType.APPLICATION_JSON)
                .param("page", "1"))
                .andExpect(jsonPath("$.page").value("1"));
    }

    @Test
    public void TagDirDetail() throws Exception{
        mockMvc.perform(get("/tag-dir/test")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.success").value(true));
    }

    @Test
    public void CreateTagDir() throws Exception{
        mockMvc.perform(post("/tag-dir")
                .contentType(MediaType.APPLICATION_JSON));
    }
}
