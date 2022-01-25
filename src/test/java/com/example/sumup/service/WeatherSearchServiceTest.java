package com.example.sumup.service;

import com.example.sumup.externalclient.WeatherClient;
import com.example.sumup.response.Weather;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

public class WeatherSearchServiceTest {

    @InjectMocks
    WeatherSearchService weatherSearchService;

    @MockBean
    WeatherClient weatherClient;


    @Test
    @SneakyThrows
    public void testTemperatureIsReturnedForACity(){


      //  when(weatherClient.fetchWeather("Berlin").)
      Weather weatherRes =  weatherSearchService.getWeather("Berlin");


      assertThat(weatherRes).isNotNull();
        assertThat(weatherRes.getTemperatureInCelcius()).isEqualTo(new Double(1));
        assertThat(weatherRes.getTemperatureInFeh()).isEqualTo(new Double(33.8));
        assertThat(weatherRes.getTemperatureInKelvin()).isEqualTo(new Double(274.15));



    }



}
