package AdvancedTesting;

public class UserRegistration {
    public static void main(String[] args) {

    }

    public static void registerUser(String username, String email, String password){
        // Check if username is null or empty
        // Check if email is null or empty
        // Check if password is at least 8 characters long
        if(username == null || username.isEmpty() || email == null || email.isEmpty() || password == null || password.length() < 8){
            throw new IllegalArgumentException("Invalid input: Check username, email, or password");
        }
    }
}
