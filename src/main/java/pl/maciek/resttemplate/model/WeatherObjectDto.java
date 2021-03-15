package pl.maciek.resttemplate.model;

import lombok.*;

import java.math.BigDecimal;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeatherObjectDto {

    private String name;
    private Map<String, BigDecimal> main;

}
