public class Problem6 {


    static public int Area(int numberOfSides , int sideLength){
        return (int) ((numberOfSides * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / numberOfSides)));
    }

    static public double Area(int numberOfSides , double sideLength ){
        return (numberOfSides * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / numberOfSides));
    }
    public static void main(String[] args) {
        System.out.println(Area(7,80));
        System.out.println(Area(6,78.76));
    }
}
