public class Problem5 {





        public static int power(int base, int exponent) {
            int result = 1;
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
            return result;
        }


        public static double power(double base, int exponent) {
            double result = 1.0;
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
            return result;
        }

        public static void main(String[] args) {
            int intPower = power(3, 4);
            double doublePower = power(2.5, 3);

            System.out.println(intPower);
            System.out.println(doublePower);
        }
    }


