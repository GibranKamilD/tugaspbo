/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRAKTIKUM200525;

/**
 *
 * @author gibra
 */
public class Elektronik {
    private int tahunProduksi;
    private String merek;
    private int garansi;
    
    public Elektronik(){
        super();
    }
    
    public String getMerek(){
        return merek;
    }
    
    public void setMerek(String merek){
        this.merek = merek;
    }
    
    public int getTahunProduksi(){
        return tahunProduksi;
    }
    
    public void setTahunProduksi(int tahunProduksi){
        this.tahunProduksi = tahunProduksi;
    }
    
    public int getGaransi(){
        return garansi;
    }
    
    public void setGaransi(int garansi){
        this.garansi = garansi;
    }
    
    public void display(){
        System.out.println("Kelas Elektronik");
        
    }
}
