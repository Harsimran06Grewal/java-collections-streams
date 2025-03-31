package AdvancedTesting;

public class TemperatureConvertor {
    public static void main(String[] args) {

    }

    // Converts temperature from Celsius to Fahrenheit.
    public static double celsiusToFahrenheit(double celsius){
        return (celsius * 9 / 5) + 32;
    }

    // Converts temperature from Fahrenheit to Celsius.
    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5 / 9;
    }
}
