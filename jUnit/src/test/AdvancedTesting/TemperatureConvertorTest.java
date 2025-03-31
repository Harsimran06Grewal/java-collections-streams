package AdvancedTesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureConvertorTest {

    @Test
    // Test case for converting Celsius to Fahrenheit.
    void celsiusToFahrenheit() {
        assertEquals(32.0, TemperatureConvertor.celsiusToFahrenheit(0));
    }

    @Test
    // Test case for converting Fahrenheit to Celsius.
    void fahrenheitToCelsius() {
        assertEquals(0.0, TemperatureConvertor.fahrenheitToCelsius(32));
    }
}