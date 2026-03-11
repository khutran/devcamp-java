package com.devcamp.rectanglerestapi.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

class RectangleControllerTests {

    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(new RectangleController()).build();
    }

    @Test
    void testGetArea() throws Exception {
        mockMvc.perform(get("/rectangle-area").param("length", "10").param("width", "5"))
                .andExpect(status().isOk())
                .andExpect(content().string("50.0"));
    }

    @Test
    void testGetPerimeter() throws Exception {
        mockMvc.perform(get("/rectangle-perimeter").param("length", "10").param("width", "5"))
                .andExpect(status().isOk())
                .andExpect(content().string("30.0"));
    }

    @Test
    void testDefaultValues() throws Exception {
        // Technically defaults are internal to the model if using default constructor, 
        // but the controller creates a new Rectangle with the params.
        mockMvc.perform(get("/rectangle-area").param("length", "1").param("width", "1"))
                .andExpect(status().isOk())
                .andExpect(content().string("1.0"));
    }
}
