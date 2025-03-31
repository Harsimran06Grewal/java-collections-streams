package BasicTesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilityMethodsTest {

    /**
     * Test case for the reverse() method.
     * Ensures that the method correctly reverses a given string.
     */
    @Test
    void reverse() {
        assertEquals("simer", StringUtilityMethods.reverse("remis"));
    }

    /**
     * Test case for the palindrome() method.
     * Checks if the method correctly identifies a palindrome.
     */
    @Test
    void palindrome() {
        assertTrue(StringUtilityMethods.palindrome("racecar"));
    }

    /**
     * Test case for the uppercase() method.
     * Verifies that the method correctly converts a string to uppercase.
     */
    @Test
    void uppercase() {
        assertEquals("SIMER", StringUtilityMethods.uppercase("simer"));
    }
}