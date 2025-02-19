import it.utils.converter.TemperatureConversion;

public class TestConversion {
    public static void main(String[] args) {
        TemperatureConversion converter = new TemperatureConversion();

        double C = 27;
        double fahrenheit = converter.celsiusToFahrenheit(C);
        double kelvin = converter.celsiusToKelvin(C);

        System.out.println("*** TemperatureConversion ***");
        System.out.println();
        System.out.println(C +" Celsius = " + fahrenheit +" Fahrenheit ");
        System.out.println(C +" Celsius = " + kelvin +" Fahrenheit ");

        double F = 85;
        double f2c = converter.fahrenheitToCelsius(F);
        double f2k = converter.fahrenheitToKelvin(F);
        System.out.println();
        System.out.println(F +" Fahrenheit = " + f2c +" Celsius ");
        System.out.println(F +" Fahrenheit = "+ f2k+ "  Kelvin ");

        double K = 120;
        double k2c = converter.kelvinToCelsius(K);
        double k2f = converter.kelvinToFahrenheit(K);
        System.out.println();
        System.out.println(K +" Kelvin = " + k2c +" Celsius ");
        System.out.println(K +" Kelvin = " + k2f +" fahrenheit ");



    }
}
