package BasicTesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    @Test
    // Test for addition
    void add() {
        assertEquals(5, Calculator.addition(2, 3));
    }


    @Test
    // Test for subtract
    void subtract() {
        assertEquals(5, Calculator.subtract(15, 10));
    }

    @Test
    // Test for multiply
    void multiply() {
        assertEquals(15, Calculator.multiply(3, 5));
    }

    @Test
    // Test for division
    void divide() {
        assertEquals(20, Calculator.divide(200 , 10));
    }

    @Test
    // Test for division by zero exception
    void divideException(){
        Exception exception = assertThrows(ArithmeticException.class, ()->Calculator.divide(10, 0));
        assertEquals("Division by zero not possible", exception.getMessage());
    }
}