package com.company.MonthAndMathService.controller;

import com.company.MonthAndMathService.models.MathSolution;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@WebMvcTest(MathSolutionController.class)
public class MathSolutionControllerTest {
    @Autowired
    private MockMvc mockMvc;
    private ObjectMapper mapper = new ObjectMapper();

    @Test
    public void shouldReturnAddSolutionObject() throws Exception {
        MathSolution solution = new MathSolution(13,38,"add", 51);

        String inputJson = mapper.writeValueAsString(solution);
        String outputJson = mapper.writeValueAsString(solution);

        mockMvc.perform(
                post("/add").content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON)
        )
                .andDo(print()).andExpect(status().isCreated()
                ).andExpect(content().json(outputJson));
    }

    @Test
    public void shouldReturn422ErrorForInvalidInputs() throws Exception {

    }

    @Test
    public void shouldReturnSubtractSolutionObject() throws Exception {
        MathSolution output = new MathSolution(40,38,"subtract", 2);

        String inputJson = mapper.writeValueAsString(output);
        String outputJson = mapper.writeValueAsString(output);

        mockMvc.perform(
                        post("/subtract").content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print()).andExpect(status().isCreated()
                ).andExpect(content().json(outputJson));
    }

    @Test
    public void shouldReturnMultiplySolutionObject() throws Exception {
        MathSolution output = new MathSolution(4,5,"multiply", 20);

        String inputJson = mapper.writeValueAsString(output);
        String outputJson = mapper.writeValueAsString(output);

        mockMvc.perform(
                        post("/multiply").content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print()).andExpect(status().isCreated()
                ).andExpect(content().json(outputJson));
    }


    @Test
    public void shouldReturnDivideSolutionObject() throws Exception  {
        MathSolution output = new MathSolution(4,5,"divide", 20);

        String inputJson = mapper.writeValueAsString(output);
        String outputJson = mapper.writeValueAsString(output);

        mockMvc.perform(
                        post("/divide").content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print()).andExpect(status().isCreated()
                ).andExpect(content().json(outputJson));
    }

}