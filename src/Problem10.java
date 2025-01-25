public class Problem10 {


    static public void InvertedTriangle(int n){
        for (int i = n; i >0 ; i--) {
            for(int j = 0;j<i;j++){
                System.out.print("* ");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        InvertedTriangle(5);
    }
}
