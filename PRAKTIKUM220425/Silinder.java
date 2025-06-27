/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRAKTIKUM220425;

/**
 *
 * @author gibra
 */
public class Silinder extends Lingkaran {
    private double tinggi;
    
    public Silinder(){
        
    }
    
    public Silinder(double r, double t){
        super(r);
        this.tinggi = t;
    }
    
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    
    public double getTinggi(){
        return tinggi;
    }
    
    public double getVolume(){
        return getLuas() * tinggi;
    }
    
    @Override
    public String toString(){
        return "Silinder r = " + getR() +
                "\nTinggi = " + tinggi + 
                "\nVolume = " + getVolume() + 
                "\nLuas = " + getLuas();
    }
    
    @Override
    public double getLuas(){
        return 2 * Math.PI * getR() * (getR() + tinggi);
    }
}
