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
public class PesawatDemo {
    public static void main(String[] args){
        Pesawat p = new Pesawat("Lion air", 2010, true, 120);
        p.cetak();
        
        System.out.println("Setelah reset");
        p.reset("Airbus", 2020, false, 200);
        p.cetak();
        
    }
}
