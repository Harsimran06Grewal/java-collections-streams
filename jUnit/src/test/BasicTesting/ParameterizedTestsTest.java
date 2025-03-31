package BasicTesting;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class ParameterizedTestsTest {

    // Parameterized test to check if numbers are even.
    // The test runs multiple times with different values from @ValueSource.
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9})
    void testIsEven_TrueCases(int number) {
        assertTrue(ParameterizedTests.isEven(number));
    }
}