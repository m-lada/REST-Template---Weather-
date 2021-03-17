package pl.maciek.resttemplate.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import pl.maciek.resttemplate.components.CityNotFoundException;

@ControllerAdvice
class ErrorController {

    @ExceptionHandler(CityNotFoundException.class)
    public String handleException() {
        return "error";
    }
}