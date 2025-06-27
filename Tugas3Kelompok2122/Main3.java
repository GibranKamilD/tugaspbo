/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3Kelompok2122;

/**
 *
 * @author gibra
 */
public class Main3 {
    public static void main(String[] args) {
        GeometricObject c = new Circle(5.0);

        System.out.println(c.toString());
        System.out.println("Area: " + c.getArea());
        System.out.println("Perimeter: " + c.getPerimeter());

        System.out.println();
        
        GeometricObject r = new Rectangle(4.0, 6.0);
        System.out.println(r.toString());
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());

    }
}
