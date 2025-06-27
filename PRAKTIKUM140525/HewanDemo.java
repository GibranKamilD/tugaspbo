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

public class HewanDemo {
    public static void main(String[] args){
        //buat objek
        
        Hewan hewanUmum = new Hewan("Makhluk Hidup");
        Kucing kucingKu = new Kucing("Bobby");
        Anjing anjingKu = new Anjing("Timmy");   
    
        hewanUmum.tampilkanNama();
        hewanUmum.Suara();
        
        System.out.println();
        
        kucingKu.tampilkanNama();
        kucingKu.Suara();
        System.out.println();
        anjingKu.tampilkanNama();
        anjingKu.Suara();
        
    }
    
    
}
