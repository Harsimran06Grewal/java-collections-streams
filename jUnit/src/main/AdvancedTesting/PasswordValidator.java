package AdvancedTesting;

public class PasswordValidator {
    public static void main(String[] args) {

    }

    // Validates if a password meets the required criteria:
    // At least 8 characters long
    // Contains at least one uppercase letter
    // Contains at least one digit
    public static boolean isValid(String password){
        return password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*\\d.*");
    }
}
