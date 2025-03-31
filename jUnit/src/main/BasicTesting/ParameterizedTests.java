package BasicTesting;

public class ParameterizedTests {
    public static void main(String[] args) {

    }

    public static boolean isEven(int number){
        // if number is divisible by 2 then number is even
        if(number % 2 == 0){
            return true;
        }
        // if number is not divisible by 2 then number is odd
        else{
            return false;
        }
    }
}
