package com.devcamp.oddevennumberapi.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

class OddEvenControllerTests {

    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(new OddEvenController())
                .addFilters(new org.springframework.web.filter.CharacterEncodingFilter("UTF-8", true))
                .build();
    }

    @Test
    void testEvenNumber() throws Exception {
        mockMvc.perform(get("/checknumber").param("number", "10"))
                .andExpect(status().isOk())
                .andExpect(content().string(org.hamcrest.Matchers.matchesPattern(".*10.*ch.*n.*")));
    }

    @Test
    void testOddNumber() throws Exception {
        mockMvc.perform(get("/checknumber").param("number", "7"))
                .andExpect(status().isOk())
                .andExpect(content().string(org.hamcrest.Matchers.matchesPattern(".*7.*l.*")));
    }
}
