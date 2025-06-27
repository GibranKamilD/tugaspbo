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
public class Kerucut extends Lingkaran{
    private double tinggi;
    
    public Kerucut(){
        this.tinggi=0;
    }
    
    public Kerucut(double r, double t){
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
        return (1.0/3.0) * 3.14 * getR() * getR() * tinggi;
    }
    
    @Override
    public double getLuas(){
        double s = Math.sqrt(Math.pow(getR(), 2) + Math.pow(tinggi, 2)); // Garis pelukis
        return Math.PI * getR() * (getR() + s);
    }
    
    @Override
    public String toString(){
        return "Jari-jari = " + getR() +
               "\nTinggi = " + tinggi +
               "\nVolume = " + getVolume() +
               "\nLuas = " + getLuas();
    }
}
