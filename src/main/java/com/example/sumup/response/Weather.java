package com.example.sumup.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Weather {

    Double temperatureInCelcius;
    Double temperatureInFeh;
    Double temperatureInKelvin;


}
