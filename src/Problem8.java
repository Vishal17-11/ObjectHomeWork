
/*
8. Given a number n, check if a number is perfect or not. A number is said to be perfect if sum
of all its factors excluding the number itself is equal to the number.*/

public class Problem8 {


    static  public boolean checkPerfect(int n){
        int factors = 1;

       if(n<0){
           return false;
       }
            factors+=(n/2)+2;
            if(factors >= n){
                return true;
            }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkPerfect(11));
    }
}
