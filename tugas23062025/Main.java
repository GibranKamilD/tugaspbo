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
public class Main {
    public static void main(String[] args) {
        // Membuat objek Author
        Author author = new Author("Tere Liye", "tereliye@gmail.com", 'M');

        // Membuat objek Book dengan qty awal 10
        Book book = new Book("Hujan", author, 75000.0, 10);

        // Menampilkan informasi awal
        System.out.println("Informasi Buku:");
        System.out.println(book);
        System.out.println("Judul: " + book.getTitle());
        System.out.println("Penulis: " + book.getAuthor().getName());
        System.out.println("Harga: Rp " + book.getPrice());
        System.out.println("Stok: " + book.getQty() + " buah");

        // Menambahkan 5 ke quantity
        book.setQty(book.getQty() + 5);
        System.out.println("\nSetelah stok ditambah 5:");
        System.out.println("Stok sekarang: " + book.getQty() + " buah");

        // Mengurangi 3 dari quantity
        book.setQty(book.getQty() - 3);
        System.out.println("\nSetelah stok dikurangi 3:");
        System.out.println("Stok sekarang: " + book.getQty() + " buah");
    }
}

