package pl.maciek.resttemplate.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeatherDto {

    private String name;

    @JsonProperty("main")
    private WeatherParams weatherParams;



}
