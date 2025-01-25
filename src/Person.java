//14. Write a Java program to create a Person class with a name and age. Implement both a default
//constructor and a parameterized constructor.


public class Person {

private String name;
private int age;

public Person(){
    this.name = "Unknown";
    this.age = 0;

}

public Person(String n,int a){
    this.name = n;
    this.age = a;
}};


