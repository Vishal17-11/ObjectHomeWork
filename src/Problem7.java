//7. WAP to calculate perimeter of rectangle n(Method Overloading)


public class Problem7 {
    static public int Perimeter(int length , int width){

        return 2*(length + width);
    }


    static public double Perimeter(double length,double width){
        return 2*(length + width);
    }

    public static void main(String[] args) {
        System.out.println(Perimeter(12,17));
        System.out.println(Perimeter(13.77,13.99));
    }

}
