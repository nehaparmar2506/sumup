package com.example.sumup.externalclient;

import lombok.Data;

@Data
public class WeatherResponse {

   Main main;



    @Data
   public static class Main{
        double temp;
    }
}
