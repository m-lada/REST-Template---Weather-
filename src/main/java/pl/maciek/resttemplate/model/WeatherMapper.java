package pl.maciek.resttemplate.model;

import java.math.BigDecimal;

public class WeatherMapper {

    static final private BigDecimal KELVIN_ZERO = BigDecimal.valueOf(273.15);

    public static Weather fromDTO(WeatherObjectDto weatherDto) {
        Weather newWeather = new Weather();

        newWeather.setCity(weatherDto.getName());
        newWeather.setTemperature_current(weatherDto.getMain().get("temp").subtract(KELVIN_ZERO));
        newWeather.setTemperature_felt(weatherDto.getMain().get("feels_like").subtract(KELVIN_ZERO));
        newWeather.setTemperature_min(weatherDto.getMain().get("temp_min").subtract(KELVIN_ZERO));
        newWeather.setTemperature_max(weatherDto.getMain().get("temp_max").subtract(KELVIN_ZERO));
        newWeather.setPressure(weatherDto.getMain().get("pressure"));
        newWeather.setHumidity(weatherDto.getMain().get("humidity"));

        return newWeather;
    }
}
