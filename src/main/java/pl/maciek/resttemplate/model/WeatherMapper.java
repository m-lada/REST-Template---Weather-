package pl.maciek.resttemplate.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class WeatherMapper {

    static final private BigDecimal KELVIN_ZERO = BigDecimal.valueOf(273.15);

    public static Weather fromDTO(WeatherDto weatherDto) {
        Weather newWeather = new Weather();

        newWeather.setCity(weatherDto.getName());

        newWeather.setTemperatureCurrent(weatherDto.getWeatherParams().getTemperatureCurrent().subtract(KELVIN_ZERO)
                .setScale(1, RoundingMode.HALF_UP));
        newWeather.setTemperatureFelt(weatherDto.getWeatherParams().getTemperatureCurrent().subtract(KELVIN_ZERO)
                .setScale(1, RoundingMode.HALF_UP));
        newWeather.setTemperatureMin(weatherDto.getWeatherParams().getTemperatureMin().subtract(KELVIN_ZERO)
                .setScale(1, RoundingMode.HALF_UP));
        newWeather.setTemperatureMax(weatherDto.getWeatherParams().getTemperatureMax().subtract(KELVIN_ZERO)
                .setScale(1, RoundingMode.HALF_UP));
        newWeather.setPressure(weatherDto.getWeatherParams().getPressure());
        newWeather.setHumidity(weatherDto.getWeatherParams().getHumidity());

        return newWeather;
    }
}
