//15. Write a Java program to create a Book class with three constructors:
//1. A default constructor that initializes the title as "Unknown Title" and price as 0.
//2. A parameterized constructor with one argument that initializes the title, and sets the price
//to 100.
//3. A parameterized constructor with two arguments that initializes both the title and price.
//In each constructor, display a message indicating which constructor was called. Use constructor
//chaining to avoid repeating code.



public class Book {

    private String title;
    private  int price;

    public Book(){
        this.title = "Unknown Title";
        this.price = 0;
        System.out.println("Default");
    }
    public Book(String title){
        this.title = title;
        this.price = 100;
        System.out.println("One Arguments");

    }
    public Book(String title, int price){
        this.title = title;
        this.price = price;
        System.out.println("Two Arguments");
    }
}
