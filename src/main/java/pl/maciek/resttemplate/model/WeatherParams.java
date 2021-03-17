package pl.maciek.resttemplate.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
public class WeatherParams {

    private BigDecimal temperatureCurrent;
    private BigDecimal temperatureFelt;
    private BigDecimal temperatureMax;
    private BigDecimal temperatureMin;
    private BigDecimal pressure;
    private BigDecimal humidity;

    @JsonCreator
    public WeatherParams(
            @JsonProperty("temp") BigDecimal temperatureCurrent,
            @JsonProperty("feels_like") BigDecimal temperatureFelt,
            @JsonProperty("temp_max") BigDecimal temperatureMax,
            @JsonProperty("temp_min") BigDecimal temperatureMin,
            @JsonProperty("pressure") BigDecimal pressure,
            @JsonProperty("humidity") BigDecimal humidity) {
        this.temperatureCurrent = temperatureCurrent;
        this.temperatureFelt = temperatureFelt;
        this.temperatureMax = temperatureMax;
        this.temperatureMin = temperatureMin;
        this.pressure = pressure;
        this.humidity = humidity;
    }
}
