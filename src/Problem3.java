import java.util.Scanner;

public class Problem3 {






        public static void printTable(int number) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number to print its multiplication table:  ");
            int number = scanner.nextInt();

            printTable(number);
        }
    }


