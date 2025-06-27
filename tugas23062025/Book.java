/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas23062025;

/**
 *
 * @author User
 */
public class Book {
    private String title;
    private Author author; // Komposisi: objek dari kelas Author
    private double price;
    private int qty;

    public Book(String title, Author author, double price, int qty) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        return "'" + title + "' by " + author.toString();
    }
}
