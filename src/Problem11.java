import java.util.Scanner;

public class Problem11 {
static public void SquareStar(int n){
int count = 0;
    while(n>0) {

        for (int i = 0; i < n; i++) {
            System.out.print("* ");


        }
        count++;
        System.out.println();
        if(count >=n){
            break;
        }

    }

}
    public static void printHollowSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void printHourglass(int rows) {

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            for (int k = i; k < rows; k++) {
                System.out.print("* ");
            }
            for (int k = i + 1; k < rows; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        for (int i = rows - 2; i >= 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            for (int k = i; k < rows; k++) {
                System.out.print("* ");
            }
            for (int k = i + 1; k < rows; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }






        public static void main(String[] args) {
//        SquareStar(6);
//        printHollowSquare(4);
        printHourglass(9);
    }

}
