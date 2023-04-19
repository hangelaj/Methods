import java.util.Scanner;

public class OverloadingMinMaxMethods {
    // Method to find the minimum of three integers
    public static int findMin(int num1, int num2, int num3) {
        int min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        return min;
    }

    // Method to find the maximum of three integers
    public static int findMax(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }

    // Method to find the minimum of three doubles
    public static double findMin(double num1, double num2, double num3) {
        double min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        return min;
    }

    // Method to find the maximum of three doubles
    public static double findMax(double num1, double num2, double num3) {
        double max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter your second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter your third number: ");
        double num3 = scanner.nextDouble();

        if (num1 % 1 == 0 && num2 % 1 == 0 && num3 % 1 == 0) {
            // Call the integer versions of the methods if all three inputs are integers
            System.out.println("Minimum: " + findMin((int) num1, (int) num2, (int) num3));
            System.out.println("Maximum: " + findMax((int) num1, (int) num2, (int) num3));
        } else {
            // Call the double versions of the methods if any of the inputs are doubles
            System.out.println("Minimum: " + findMin(num1, num2, num3));
            System.out.println("Maximum: " + findMax(num1, num2, num3));
        }
    }
}