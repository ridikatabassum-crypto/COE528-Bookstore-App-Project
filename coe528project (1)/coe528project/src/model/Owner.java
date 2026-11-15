package model;

import java.util.ArrayList;

public class Owner extends User {
    
    // Constructor
    public Owner(String username, String password) {
        super(username, password);
    }
    
    // Add Book
    public void addBook(BookStore store, Book book) {
        store.getBooks().add(book);
    }
    
    // Delete Book
    public void deleteBook(BookStore store, Book book) {
        store.getBooks().remove(book);
    }
    
    // Add Customer
    public void addCustomer(BookStore store, Customer customer) {
        store.getCustomers().add(customer);
    }
    
    // Delete Customer
    public void deleteCustomer(BookStore store, Customer customer) {
        store.getCustomers().remove(customer);
    }
}

