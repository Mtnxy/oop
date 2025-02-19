package it.utils.converter;

public interface TemperatureConverter {
    public double celsiusToFahrenheit(double celsius);
    public double celsiusToKelvin(double celsius);
    public double fahrenheitToCelsius(double fahrenheit);
    public double fahrenheitToKelvin(double fahrenheit);
    public double kelvinToCelsius(double kelvin);
    public double kelvinToFahrenheit(double kelvin);

}
