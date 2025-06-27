/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1Kelompok2122;

/**
 *
 * @author gibra
 */
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        
        while(true){
            System.out.println("Pilih bentuk yang ingin dibuat:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.print("Masukkan pilihan: ");
            int choice = n.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan radius: ");
                    double radius = n.nextDouble();
                    System.out.print("Masukkan warna: ");
                    String circleColor = n.next();
                    System.out.print("Apakah terisi? (true/false): ");
                    boolean circleFilled = n.nextBoolean();

                    Circle c = new Circle(radius, circleColor, circleFilled);
                    System.out.println(c);
                    System.out.println("Luas : " + c.getArea());
                    System.out.println("Keliling : " + c.getPerimeter());
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Masukkan lebar: ");
                    double width = n.nextDouble();
                    System.out.print("Masukkan panjang: ");
                    double length = n.nextDouble();
                    System.out.print("Masukkan warna: ");
                    String rectangleColor = n.next();
                    System.out.print("Apakah terisi? (true/false): ");
                    boolean rectangleFilled = n.nextBoolean();

                    Rectangle r = new Rectangle(width, length, rectangleColor, rectangleFilled);
                    System.out.println(r);
                    System.out.println("Luas : " + r.getArea());
                    System.out.println("Keliling : " + r.getPerimeter());
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Masukkan sisi: ");
                    double side = n.nextDouble();
                    System.out.print("Masukkan warna: ");
                    String squareColor = n.next();
                    System.out.print("Apakah terisi? (true/false): ");
                    boolean squareFilled = n.nextBoolean();

                    Square s = new Square(side, squareColor, squareFilled);
                    System.out.println(s);
                    System.out.println("Luas : " + s.getArea());
                    System.out.println("Keliling : " + s.getPerimeter());
                    System.out.println();
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }
}

