package pl.maciek.resttemplate.components;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.maciek.resttemplate.model.Weather;
import pl.maciek.resttemplate.model.WeatherMapper;
import pl.maciek.resttemplate.model.WeatherObjectDto;

@Service
public class WeatherService {

    private final String URL_PREFIX = "http://api.openweathermap.org/data/2.5/weather?q=";
    private final String URL_TOKEN = "&appid=1483a45dff8adf90ef0cf91b2f3d5571";

    public Weather getWeatherForCity(String city) {
       try {
           RestTemplate restTemplate = new RestTemplate();
           String finalURL = URL_PREFIX + city + URL_TOKEN;
           WeatherObjectDto weatherDTO = restTemplate.getForObject(finalURL, WeatherObjectDto.class);
           return WeatherMapper.fromDTO(weatherDTO);
       } catch (Exception exception) {
           throw new CityNotFoundException();
       }
    }

}
