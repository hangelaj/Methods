public class FibonacciCalc {
    public static void main(String[] args) {
        Fibonacci(100); //method calls the Fibonacci() method with an argument of 100.
    }
    //Fibonacci() method takes an integer parameter
    public static void Fibonacci(int num) {
        int num1 = 0, num2 = 1, sum; //inside the method, initialize two variables num1 and num2
        // to the first two numbers of the Fibonacci sequence,  0 and 1.
                     //*****//
        System.out.println(num1); //print num1 to the console
        System.out.println(num2);//print  num2 to the console
                      //*****//
//for loop to calculate and print the remaining num - 2 Fibonacci numbers
        for (int i = 2; i < num; i++) {
           //each iteration of the loop, we calculate the next number in the sequence
            // by adding the previous two numbers (num1 and num2),
            // and store the result in a variable sum.
            sum = num1 + num2;
            System.out.println(sum); ////We print sum to the console.
            num1 = num2; //update the values of num1 and num2 to prepare for the next iteration of the loop
            num2 = sum;
        }
    }
}