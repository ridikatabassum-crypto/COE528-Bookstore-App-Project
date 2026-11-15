package model;

import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class BookStore {
    
    // Instance variables
    private ArrayList<Book> books;
    private ArrayList<Customer> customers;
    private Owner owner;
    
    // Constructor
    public BookStore() {
        books = new ArrayList<>();
        customers = new ArrayList<>();
        owner = new Owner("admin", "admin");
    }
    
    // Getters
    public ArrayList<Book> getBooks() {
        return books;
    }
    
    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    
    public Owner getOwner() {
        return owner;
    }
    
    // Add Book
    public void addBook(Book book) {
        books.add(book);
    }
    
    // Delete Book
    public void deleteBook(Book book) {
        books.remove(book);
    }
    
    // Add Customer
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    
    // Delete Customer
    public void deleteCustomer(Customer customer) {
        customers.remove(customer);
    }
    
    // Login method
    public User login(String username, String password) {
        
        // Check owner
        if (owner.login(username, password)) {
            return owner;
        }
        
        // Check customers
        for (Customer c : customers) {
            if (c.getUsername().equals(username) &&
                c.getPassword().equals(password)) {
                return c;
            }
        }
        
        return null; // login failed
    }
    
    // Load books from books.txt
    public void loadBooks() {
        try {
            File file = new File("books.txt");
            
            if (!file.exists()) {
                return;
            }
            
            Scanner input = new Scanner(file);
            
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] parts = line.split(",");
                
                String name = parts[0];
                double price = Double.parseDouble(parts[1]);
                
                books.add(new Book(name, price));
            }
            
            input.close();
        } catch (Exception e) {
            System.out.println("Error loading books");
        }
    }
    
    // Load customers from customers.txt
    public void loadCustomers() {
        try {
            File file = new File("customers.txt");
            
            if (!file.exists()) {
                return;
            }
            
            Scanner input = new Scanner(file);
            
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] parts = line.split(",");
                
                String username = parts[0];
                String password = parts[1];
                int points = Integer.parseInt(parts[2]);
                
                customers.add(new Customer(username, password, points));
            }
            
            input.close();
        } catch (Exception e) {
            System.out.println("Error loading customers");
        }
    }
    
    // Save books to books.txt
    public void saveBooks() {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("books.txt"));
            
            for (Book b : books) {
                writer.println(b.getName() + "," + b.getPrice());
            }
            
            writer.close();
        } catch (Exception e) {
            System.out.println("Error saving books");
        }
    }
    
    // Save customers to customers.txt
    public void saveCustomers() {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("customers.txt"));
            
            for (Customer c : customers) {
                writer.println(c.getUsername() + "," + c.getPassword() + "," + c.getPoints());
            }
            
            writer.close();
        } catch (Exception e) {
            System.out.println("Error saving customers");
        }
    }
}