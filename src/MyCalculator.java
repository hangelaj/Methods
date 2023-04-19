import java.util.Scanner;

public class MyCalculator {
    // Method to add two numbers
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method to subtract two numbers
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Method to multiply two numbers
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Method to divide two numbers
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a large number to use: ");
        double num1 = scanner.nextDouble();

        System.out.print("Please enter a small number to use: ");
        double num2 = scanner.nextDouble();
        double a = add(num1, num2 );
        double b = subtract(num1, num2 );
        double c = multiply(num1, num2 ) ;
        double d = divide(num1, num2 ) ;

        // Call the four methods and print the results
        System.out.println("The addition of your number is: " + a);
        System.out.println("The subtraction of your number is: " + b);
        System.out.println("The multiplication of your number is: " + c);
        System.out.println("The division of your number is: " + d);

    }
}