package pl.maciek.resttemplate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.maciek.resttemplate.components.WeatherService;

@Controller
public class WeatherController {

    private WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/")
    public String home(Model model, @RequestParam(required = false) String city) {
        if(city != null){
            model.addAttribute("weather", weatherService.getWeatherForCity(city));
        }
        return "home";
    }
}
