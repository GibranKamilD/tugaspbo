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
public class Lingkaran {
    private double r;
    
    public Lingkaran(){
        
    }
    
    public Lingkaran(double r){
        this.r = r;
    }
    
    public void setR(){
        this.r = r;
    }
    
    public double getR(){
        return r; 
    }
    
    public double getDiameter(){
        return r * 2;
    }
    
    public double getKeliling(){
        return r * Math.PI * 2;
    }
    
    public double getLuas(){
        return Math.PI * r * r;
    }
    
    @Override
    public String toString(){
    return "Jari-jari = "+ r + 
                "\nDiameter  = "+ getDiameter()+
                "\nKeliling = "+ getKeliling()+
                "\nLuas = "+ getLuas();
        
    }
}
