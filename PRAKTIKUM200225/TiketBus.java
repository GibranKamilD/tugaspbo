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

public class TiketBus {
    public static void main(String[] args){
        int menu, jum_tiket = 0;
        long harga, tot_awal;
        float diskon = 0, tot_bayar;
        
        Scanner gua = new Scanner(System.in);
        
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX|");
        System.out.println("|         KELAS         |       Harga/Tiket      |");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX|");
        System.out.println("|   1.Ekonomi           |    Rp. 350.000,00      |");
        System.out.println("|   2.Eksekutif         |    Rp. 500.000,00      |");
        System.out.println("|   3.Super Eksekutif   |    Rp. 650.000,00      |");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX|");
        System.out.print("Pilih tiket (angka) = ");
        menu = gua.nextInt();
        System.out.print("Masukan Jumlah tiket = ");
        jum_tiket = gua.nextInt();
        switch(menu){
            case 1: 
            {
                harga = 350000;
            }break;
            case 2: 
            {
                harga = 500000;
            }break;
            case 3: 
            {
                harga = 650000;
            }break;
            default: 
            {
                harga = 0;
                System.out.println("Lu piliah kelas yang tersedia!");
            }break;
        }
        tot_awal = harga*jum_tiket;
        if(jum_tiket>4)
        {
            System.out.println("Diskon 10% untuak kawannn!!");
            diskon = (float) (0.1*tot_awal);
        }
        else
        {
            diskon=0;
        }
        
        tot_bayar = tot_awal-diskon;
        System.out.println("Biaya awal = "+tot_awal);
        System.out.println("Diskon     = "+diskon);
        System.out.println("Bayar      = "+tot_bayar);
        }
        
    }
