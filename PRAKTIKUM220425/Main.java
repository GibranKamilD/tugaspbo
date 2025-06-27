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
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double r = 0, t = 0;
        int pilih;
        
        
        System.out.println("Menu Bangun");
        System.out.println("1. Lingkaran");
        System.out.println("2. Kerucut");
        System.out.println("3. Silinder");
        System.out.print("Input pilihan : ");
        pilih = in.nextInt();
        
        switch(pilih){
            case 1:
            {
                System.out.print("Masukkan jari-jari lingkaran: ");
                r = in.nextDouble();
                
                Lingkaran li = new Lingkaran(r);
                System.out.println("Hasil Perhitungan");
                System.out.println("Lingkaran = ");
                System.out.println(li.toString());
                break;
            }
            
            case 2: 
            {
                System.out.print("Masukkan jari-jari lingkaran: ");
                r = in.nextDouble();
                System.out.print("Masukkan tinggi lingkaran: ");
                t = in.nextDouble();
                Kerucut ker = new Kerucut(r, t);
                System.out.println("Hasil Perhitungan");
                System.out.println("Kerucut = ");
                System.out.println(ker.toString());
                break;
            }
            
            case 3: 
            {
                System.out.print("Masukkan jari-jari lingkaran: ");
                r = in.nextDouble();
                System.out.print("Masukkan tinggi lingkaran: ");
                t = in.nextDouble();
                
                Silinder sil = new Silinder(r, t);
                System.out.println("Hasil Perhitungan");
                System.out.println("Silinder = ");
                System.out.println(sil.toString());
                break;
            }
            
            default :
            {
                System.out.println("Pilihan tidak valid");
                break;
            }
        }
       
    }
}
