/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRAKTIKUM200225;

/**
 *
 * @author LABSIKOMP03
 */

import java.util.Scanner;

public class InputVariabel {
    public static void main(String[] args) {
        String nama;
        int umur;
        char jk;
        float rapor;
        boolean asal;
        Scanner input = new Scanner(System.in);
        System.out.println("== Program Input Variabel==");
        System.out.print("Namo lu = ");
        
        nama = input.nextLine(); //baca String
        System.out.print("Umua lu = ");
        umur = input.nextInt(); //baca integer
        
        System.out.print("Gender L/P = ");
        jk = input.next().charAt(0); //baca Karakter atau baca char
        
        System.out.print("Rata-rata Rapor = ");
        rapor = input.nextFloat(); //baca float
        
        System.out.print("Asal Padang (true/false) = ");
        asal = input.nextBoolean(); //baca boolean
        
        System.out.println("\n==Input Data Anda==");
        System.out.println("Namo gue = "+nama);
        System.out.println("Umua gue = "+umur+" Tahun");
        System.out.println("Gender gue = "+jk);
        System.out.println("Rata-rata rapor = "+rapor);
        if(asal) //asal = true
            System.out.println("Gue akamsi");
        else //asal = false
            System.out.println("gue indak urang sini");
        //endif
        
        
    }
}
