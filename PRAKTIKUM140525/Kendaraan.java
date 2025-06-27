/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRAKTIKUM140525;

/**
 *
 * @author gibra
 */
public class Kendaraan {
    private String nama;
    private int tahunProduksi;
    
    public Kendaraan(){
        
    }
    
    public Kendaraan(String nama, int tahunProduksi){
        this.nama = nama;
        this.tahunProduksi = tahunProduksi;
        
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama=nama;
    }
    
    public int getTahunProduksi(){
        return tahunProduksi;
    }
    
    public void setTahunProduksi(int tahunproduksi){
        this.tahunProduksi = tahunProduksi;
    }
    
    public void cetak(){
        System.out.println("Nama Kendaraan ="+nama);
        System.out.println("Tahun Produksi ="+tahunProduksi);
    }
    
}
