// Create a class representing a computer with private member variable (brand, model, price)
//and public methods (getters and setters)


public class computer {

    private String brand;
    private String model;
    private int price;


    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public int getPrice(){
        return price;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setModel(String model ){
        this.model = model;
    }
    public void setPrice(int price){
        this.price = price;
    }
}

