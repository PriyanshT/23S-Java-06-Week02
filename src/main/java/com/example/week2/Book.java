package com.example.week2;

import java.util.Arrays;
import java.util.List;

/**
 * This is our model
 */
public class Book {
    private int bookID;
    private String bookName, author, genre;
    private double price;
    private boolean isAvailable;

    // constructor
    public Book(int bookID, String bookName, String author, String genre, double price, boolean isAvailable) {
        setBookID(bookID);
        setBookName(bookName);
        setAuthor(author);
        setGenre(genre);
        setPrice(price);
        setAvailable(isAvailable);
    }

    // getter and setters
    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        if(bookID <= 0){
            throw new IllegalArgumentException("Book ID cannot ne negative.");
        }
        else{
            this.bookID = bookID;
        }
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        if(bookName.isEmpty()){
            throw new IllegalArgumentException("Book Name cannot be null.");
        }
        else{
            this.bookName = bookName;
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if(author.isEmpty()){
            throw new IllegalArgumentException("Author cannot be empty.");
        }
        else{
            this.author = author;
        }
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        List<String> validGenres = Arrays.asList("Drama", "Thriller", "Fantasy", "Crime", "Comedy");
        if(validGenres.contains(genre)){
            this.genre = genre;
        }
        else {
            throw new IllegalArgumentException("Genres should be from the list: " + validGenres);
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0){
            throw new IllegalArgumentException("Price cannot be negative");
        }else{
            this.price = price;
        }
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return bookID + ": The price of " + bookName + " written by " + author +
                " is $" + price + ". Availability: " + (isAvailable?"Yes":"No");
    }
}