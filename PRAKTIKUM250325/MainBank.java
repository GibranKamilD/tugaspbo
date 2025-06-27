/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRAKTIKUM250325;

/**
 *
 * @author gibra
 */
public class MainBank {
    public static void main(String[] args){
        
        Nasabah n1 = new Nasabah("Gibran","Kamil");
        Tabungan t1 = new Tabungan(6000);
        n1.setTabungan(t1);
        
        Nasabah n2 = new Nasabah("Asep","Stending");
        Tabungan t2 = new Tabungan(8000);
        n2.setTabungan(t2);
        
        
        System.out.println("Informasi nasabah dan saldo");
        System.out.println(n1);
        System.out.println(n2);
        System.out.println();
        
        System.out.println("Riwayat tabungan nasabah");
        
        t1.simpanUang(4000);
        System.out.println("Gibran Kamil menabung 4000, jumlah saldo : " + t1.getSaldo());
        
        t2.simpanUang(7000);
        System.out.println("Asep Stending menabung 7000, jumlah saldo : " + t2.getSaldo());
        System.out.println();
        
        t1.ambilUang(5000);
        System.out.println("Gibran Kamil mengambil uang sebesar 5000, sisa saldo : "+t1.getSaldo());
        
        t1.ambilUang(5000);
        System.out.println("Gibran Kamil mengambil uang sebesar 5000, sisa saldo : "+t1.getSaldo());
        
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
        
        
    }
}
