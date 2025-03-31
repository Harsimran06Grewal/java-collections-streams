package BasicTesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExceptionHandlingTest {

    // Test to verify that dividing by zero throws an ArithmeticException.
    @Test
    void divide() {
        assertThrows(ArithmeticException.class, ()-> ExceptionHandling.divide(5, 0));
    }
}