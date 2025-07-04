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
public class Circle extends Shape {
    private double radius = 1.0;
    
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    @Override
    public String toString() {
        return "-- Hasil Circle --"+
               "\nRadius = "+ radius+
               "\ncolor = " + getColor() + 
               "\nfilled = " + isFilled();
    }
}
