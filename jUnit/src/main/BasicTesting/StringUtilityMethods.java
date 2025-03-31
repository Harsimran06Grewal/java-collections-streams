package BasicTesting;

public class StringUtilityMethods {
    public static void main(String[] args) {
        // Main method
    }

    // Method to reverse a string
    public static String reverse(String str){
        StringBuilder reversed = new StringBuilder();

        for(int i = str.length() - 1; i >= 0; i--){
           reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }

    // Method to check if a string is a palindrome
    public static boolean palindrome(String str){
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != str.charAt(str.length() - i - 1)){
                return false;
            }
        }
        return true;
    }

    // Method to convert a string to uppercase
    public static String uppercase(String str){
        String str1 = str.toUpperCase();
        return str1;
    }
}
