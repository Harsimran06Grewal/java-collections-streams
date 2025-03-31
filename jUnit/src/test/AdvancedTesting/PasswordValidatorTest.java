package AdvancedTesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    // Password must conatin
    //At least 8 characters long
    // Contains at least one uppercase letter
    // Contains at least one digit
    void isValid() {
        String password = "Harsimer06";

        assertTrue(PasswordValidator.isValid(password));
    }
}