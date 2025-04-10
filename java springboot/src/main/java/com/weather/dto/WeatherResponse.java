/*天气模型类 */
package com.weather.dto;

import lombok.Data;

@Data
public class WeatherResponse {
    private WeatherMain main;
    private WeatherInfo[] weather;
    private Wind wind;
    private String name;

    @Data
    public static class WeatherMain {
        private double temp;
        private double feelsLike;
        private double tempMin;
        private double tempMax;
        private int humidity;
        private int pressure;
    }

    @Data
    public static class WeatherInfo {
        private String main;
        private String description;
        private String icon;
    }

    @Data
    public static class Wind {
        private double speed;
        private int deg;
    }
}