package com.example.sumup.externalclient.converter;


import com.example.sumup.externalclient.WeatherResponse;
import com.example.sumup.response.Weather;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class WeatherConverter {


    public Weather convert(ResponseEntity<WeatherResponse> result) {

        Double kelvinTemperature =  result.getBody().getMain().getTemp();
                Double celTemperature = kelvinTemperature - 273.15;
                Double fehTemperature = (kelvinTemperature-273.15)* (9/5) + 32;

                return new Weather(celTemperature,fehTemperature, kelvinTemperature );

    }
}
