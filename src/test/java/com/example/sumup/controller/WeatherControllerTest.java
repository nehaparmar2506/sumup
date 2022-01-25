package com.example.sumup.controller;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest
@AutoConfigureMockMvc
public class WeatherControllerTest {

    MockMvc mockMvc;




    @Test
    @SneakyThrows
    public void testGetWeatherReturnsOk() {

        mockMvc.perform(get("/weather").param("city", "Berlin"))
                .andExpect(status().isOk());

    }
}
