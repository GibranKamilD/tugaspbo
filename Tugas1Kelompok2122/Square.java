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
public class Square extends Rectangle {
    
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    
    public double getSide() {
        return getWidth(); // karena width dan length sama
    }
    @Override
    public String toString() {
        return "-- Hasil Square --"+
               "\nWidth : "+ getSide() + 
               "\nLength : "+ getLength() + 
               "\ncolor = " + getColor() + 
               "\nfilled = " + isFilled();
    }
    
    
}
