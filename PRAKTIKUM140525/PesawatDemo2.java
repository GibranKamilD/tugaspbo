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
public class PesawatDemo2 {
    public static void main(String[] args){
        Pesawat[] daftarPesawat = new Pesawat[3];
        
        //mengisi elemen array
        daftarPesawat[0] = new Pesawat("Lion Air", 2015, true, 80);
        daftarPesawat[1] = new Pesawat("Lamborghini", 2012, true, 30);
        daftarPesawat[2] = new Pesawat("Adidas", 2018, false, 125);
        
        //menampilkan isi array
        for(int i=0;i<daftarPesawat.length;i++){
            System.out.println("Data Pesawat ke "+(1+1)+"adalah ");
            daftarPesawat[i].cetak();
            System.out.println();
        }
        
    }
}
