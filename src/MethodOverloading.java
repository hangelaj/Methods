public class MethodOverloading {
//two methods with the same name "plusMethod" are declared but with different parameter types.
//two integer parameters and returns their sum as an integer,
   public static int plusMethod(int x, int y) {
        return x + y;
    }
    // while the second method accepts two double parameters and returns their sum as a double.
    public static double plusMethod(double x, double y) {
        return x + y;
    }
//In the main method,two overloaded methods are called with different arguments,
// the returned values are stored in variables myNum1 and myNum2 respectively.
    public static void main(String[] args) {
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        //the results are printed using System.out.println() method.
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }

}
