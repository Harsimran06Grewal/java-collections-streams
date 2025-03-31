package BasicTesting;

public class ExceptionHandling {
    public static void main(String[] args) {

    }

    public static int divide(int a, int b) throws ArithmeticException{
        try{
            // Check if denominator is zero before performing division
            if(b == 0){
                throw new ArithmeticException("Can't divide by zero");
            }
        }
        catch (ArithmeticException e){
            System.out.println();
        }

        // Perform division
        return a / b;
    }
}
