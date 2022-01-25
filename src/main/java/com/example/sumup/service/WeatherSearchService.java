package com.example.sumup.service;

import com.example.sumup.externalclient.WeatherClient;
import com.example.sumup.response.Weather;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URISyntaxException;

@Service
@AllArgsConstructor
public class WeatherSearchService {

    @Autowired
    WeatherClient weatherClient;



    public Weather getWeather(String city) throws URISyntaxException {

        return     weatherClient.fetchWeather(city);


    }

}


