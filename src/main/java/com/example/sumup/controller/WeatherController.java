package com.example.sumup.controller;

import com.example.sumup.response.Weather;
import com.example.sumup.service.WeatherSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.Optional;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    WeatherSearchService weatherSearchService;

    @GetMapping
    public ResponseEntity<Weather> getWeather(@RequestParam String city) throws URISyntaxException {

      return   ResponseEntity.of(Optional.of(weatherSearchService.getWeather(city)));
    }
}
