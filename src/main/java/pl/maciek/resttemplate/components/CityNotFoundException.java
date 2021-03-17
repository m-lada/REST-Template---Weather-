package pl.maciek.resttemplate.components;

public class CityNotFoundException extends RuntimeException {

    public CityNotFoundException() {
        super("Błąd podczas pobierania informacji o podanej miejscowości.");
    }
}
