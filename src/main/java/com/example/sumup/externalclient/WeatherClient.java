package com.example.sumup.externalclient;

import com.example.sumup.externalclient.converter.WeatherConverter;
import com.example.sumup.response.Weather;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@Component
@AllArgsConstructor
public class WeatherClient {

    @Autowired
    WeatherConverter weatherConverter;

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }




    public Weather fetchWeather(String city) throws URISyntaxException {
        final String baseUrl = "https://api.openweathermap.org/data/2.5/weather?q="+city+"&appid=3fc9cb54394cc7ad0010daa12eb9e286";
        URI uri = new URI(baseUrl);

        ResponseEntity<WeatherResponse> result = restTemplate().getForEntity(uri, WeatherResponse.class);

       return weatherConverter.convert(result);


    }
}
