package model;

/**
 *
 * @author yusra
 */
public class Book {
    // Adding the instance variables
    private String name; // Book name
    private double price; // Book price
    
    // Adding the constructor
    public Book(String name, double price) {
        // Initializing the instance variables in the constructor
        this.name = name;
        this.price = price;
    }
    
    // Adding the getter methods
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
       
    // Adding the setter methods
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
    // Adding the toString method
    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
    
}


