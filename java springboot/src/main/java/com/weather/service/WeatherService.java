/*调用openweather api的主要服务类 */
package com.weather.service;

import com.weather.config.WeatherConfig;
import com.weather.dto.WeatherResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
@RequiredArgsConstructor
public class WeatherService {
    private final WeatherConfig weatherConfig;
    private final RestTemplate restTemplate = new RestTemplate();

    public WeatherResponse getWeatherByCity(String city) {
        String url = UriComponentsBuilder
                .fromHttpUrl(weatherConfig.getBaseUrl())
                .path("/weather")
                .queryParam("q", city)
                .queryParam("appid", weatherConfig.getApiKey())
                .queryParam("units", "metric")
                .build()
                .toUriString();

       return restTemplate.getForObject(url, WeatherResponse.class);
    }
}