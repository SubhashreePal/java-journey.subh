/*  Java Arithmetic Operators - 
    + Addition
    - Subtraction
    * Multiplication
    / Division
    % Modulus (Remainder)
*/



public class Day3 {
    public static void main(String[] args){
        int a = 10;
        int b = 3;

        int sum = a + b; // Addition
        int difference = a - b; // Subtraction
        int product = a * b; // Multiplication
        double quotient = (double) a / b; // Division (casting to double for accurate result)
        int remainder = a % b; // Modulus

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
    
}
