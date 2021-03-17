package pl.maciek.resttemplate.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Weather {

    private String city;
    private BigDecimal temperatureCurrent;
    private BigDecimal temperatureFelt;
    private BigDecimal temperatureMax;
    private BigDecimal temperatureMin;
    private BigDecimal pressure;
    private BigDecimal humidity;

}
