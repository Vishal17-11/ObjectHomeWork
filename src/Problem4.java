
//4. WAP to find the maximum of two numbers (Method Overloading)


public class Problem4 {
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }


    public static double max(double a, double b) {
        return (a > b) ? a:b;
    }

    public static void main(String[] args) {
        System.out.println(max(8.9,9.9));
        System.out.println(max(8,4));
    }
}
