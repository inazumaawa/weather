/*读取api配置 */
package com.weather.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "openweather")
public class WeatherConfig {
    private String apiKey;
    private String baseUrl;
}