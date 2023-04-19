import java.util.Scanner;

public class MinMaxMethods {
    // Method to find the minimum of three numbers
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

    // Method to find the maximum of three numbers
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter your second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter your third number: ");
        int num3 = scanner.nextInt();

        // Call the two methods and print the results
        System.out.println("Minimum: " + findMin(num1, num2, num3));
        System.out.println("Maximum: " + findMax(num1, num2, num3));

    }
}