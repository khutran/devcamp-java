package com.devcamp.stringlengthapi.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

class LengthControllerTests {

    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(new LengthController()).build();
    }

    @Test
    void testGetLength() throws Exception {
        mockMvc.perform(get("/length").param("input", "Hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("5"));
    }

    @Test
    void testGetEmptyLength() throws Exception {
        mockMvc.perform(get("/length").param("input", ""))
                .andExpect(status().isOk())
                .andExpect(content().string("0"));
    }

    @Test
    void testGetLongLength() throws Exception {
        mockMvc.perform(get("/length").param("input", "Spring Boot API"))
                .andExpect(status().isOk())
                .andExpect(content().string("15"));
    }
}
