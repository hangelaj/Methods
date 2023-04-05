public class Demo {
    // Main method
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        // method calls
        int c = SumMethod(a, b);
        display(c);
    }

    private static int SumMethod(int a, int b) {
        return a;

    }

    // return the sum of the number
    public static int sumMethod(int n, int m) {
        int sum = 0;
        sum = n + m;
        return sum;
    }

    public static void display(int sum)
    {
        System.out.println("This method print the variable");
        System.out.println("this sum is =" + sum);
    }
}
