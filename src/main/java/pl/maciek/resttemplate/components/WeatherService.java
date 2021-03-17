package pl.maciek.resttemplate.components;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.maciek.resttemplate.model.Weather;
import pl.maciek.resttemplate.model.WeatherMapper;
import pl.maciek.resttemplate.model.WeatherDto;

import java.net.URI;

@Service
public class WeatherService {

    private RestTemplate restTemplate;

    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    private static final String URL_PREFIX = "http://api.openweathermap.org/data/2.5/weather?q=";
    private static final String URL_TOKEN = "&appid=1483a45dff8adf90ef0cf91b2f3d5571";

    public Weather getWeatherForCity(String city) {
       try {
           URI url = new URI(URL_PREFIX + city + URL_TOKEN);
           WeatherDto weatherDTO = restTemplate.getForObject(url, WeatherDto.class);
           return WeatherMapper.fromDTO(weatherDTO);
       } catch (Exception exception) {
           throw new CityNotFoundException();
       }
    }

}
