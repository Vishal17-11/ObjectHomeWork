//1. Create a class representing a library book with private member variables (title, author, price)
//and public methods (getters and setters)


public class LibraryBook {

private String title;
private  String author;
private int price;

public String getTitle(){

    return title;

}
public String getAuthor(){
    return author;
}
public int getPrice(){
    return price;
}

    public void setAuthor(String author) {
        this.author = author;
    }
    public void setTitle(String title){
    this.title = title;
    }

    public void setPrice(int price){
    this.price = price;
    }
}
