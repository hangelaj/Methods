public class NewversionOverloadingMethod {

        static int plusMethod(int x, int y) {
            return x + y;
        }

        static double plusMethod(double x, double y) {
            return x + y;
        }

        static void performOperation(double x, double y) {
            System.out.println("double: " + plusMethod(x, y));
        }

        static void performOperation(int x, int y) {
            System.out.println("int: " + plusMethod(x, y));
        }

        public static void main(String[] args) {
            double userNum1 = 8.0;
            double userNum2 = 5.0;

            // Check if user input has a floating point value
            if (userNum1 % 1 == 0 && userNum2 % 1 == 0) {
                int num1 = (int) userNum1;
                int num2 = (int) userNum2;
                performOperation(num1, num2);
            } else {
                performOperation(userNum1, userNum2);
            }
        }
    }

