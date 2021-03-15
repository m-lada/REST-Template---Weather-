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
    private BigDecimal temperature_current;
    private BigDecimal temperature_felt;
    private BigDecimal temperature_max;
    private BigDecimal temperature_min;
    private BigDecimal pressure;
    private BigDecimal humidity;

}
