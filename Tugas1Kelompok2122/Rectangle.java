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
public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;
    
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    
    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }
    
    public double getArea() {
        return width * length;
    }
    
    public double getPerimeter() {
        return 2 * (width + length);
    }
    
    @Override
    public String toString() {
        return "-- Hasil Rectangle --"+
               "\nWidth : "+ width + 
               "\nLength : "+ length +
               "\ncolor = " + getColor() + 
               "\nfilled = " + isFilled();
    }
    
}
