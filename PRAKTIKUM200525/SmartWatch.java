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
public class SmartWatch extends Smartphone{
    private int ukuranLayar;
    private boolean tahanAir;
    
    public SmartWatch(){
        super();
    }
    
    public int getUkuranLayar(){
        return ukuranLayar;
    }
    
    public void setUkuranLayar(int ukuranLayar){
        this.ukuranLayar = ukuranLayar;
    }
    
    public boolean isTahanAir(){
        return tahanAir;
    }
    
    public void setTahanAir(boolean tahanAir){
        this.tahanAir = tahanAir;
    }
    
    public void display(){
        System.out.println("Kelas Smartwatch");
        System.out.println("Merek : " + super.getMerek());
        System.out.println("Tahun Produksi : " + super.getTahunProduksi());
        System.out.println("Garansi : " + super.getGaransi());
        System.out.println("Kapasitas baterai : " + super.getKapasitasBaterai());
        System.out.println("");
        System.out.println();
    }
}
