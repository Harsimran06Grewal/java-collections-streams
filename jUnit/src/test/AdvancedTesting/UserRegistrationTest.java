package AdvancedTesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    // Successful user registration
    @Test
    void validUserRegistration() {
        assertDoesNotThrow(() -> UserRegistration.registerUser("Alice", "alice@mail.com", "password123"));
    }

    // User registration should fail when the username is empty
    @Test
    void invalidUserRegistration(){
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("", "alice@mail.com", "password123"));
    }

    // User registration should fail when the password is too short (less than required length)
    @Test
    public void invalidUser_ShortPassword() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("Alice", "alice@mail.com", "123"));
    }
}
