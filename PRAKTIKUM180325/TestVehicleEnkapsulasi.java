/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRAKTIKUM180325;
import java.util.Scanner;
/**
 *
 * @author gibra
 */
public class TestVehicleEnkapsulasi {
    public static void main(String[] args){
        System.out.println("Kendaraan 1. Beban maksimal 10.000 kg");
        VehicleEnkapsulasi kendaraan1 = new VehicleEnkapsulasi(10000);
        
        //menambahkan beban
        System.out.println("Menambahkan beban 1 (500kg)"+ kendaraan1.addLoad(500));
        System.out.println("Menambahkan beban 2 (250kg)"+ kendaraan1.addLoad(250));
        System.out.println("Menambahkan beban 3 (5000kg)"+ kendaraan1.addLoad(5000));
        System.out.println("Menambahkan beban 4 (4000kg)"+ kendaraan1.addLoad(4000));
        System.out.println("Menambahkan beban 5 (350kg)"+ kendaraan1.addLoad(350));
        
        //Menampilkan beban kendaraan
        System.out.println("Beban kendaraan saat ini: "+ kendaraan1.getLoad()+" kg");
        
        //membuat objek kendaraan2 menggunakan konstruktor kosong
        Scanner in = new Scanner(System.in);
        System.out.println("Kendaraan 2. Beban maksimal belum ada");
        VehicleEnkapsulasi kendaraan2 = new VehicleEnkapsulasi(10000);
        
        //set maxLoad menggunakan method setMaxLoad
        System.out.print("Masukan beban maksimal kendaraan: ");
        double bebanmax = in.nextDouble();
        kendaraan2.setMaxLoad(bebanmax);
        
        //isi beban pada kendaraan
        System.out.print("Masukan berat beban yang akan diletakkan di kendaraan2:");
        double beban = in.nextDouble();
        while(kendaraan2.addLoad(beban)){
            System.out.println("Beban ditambahkan "+ beban + " kg");
            System.out.print("Masukan berat beban yang akan diletakkan di kendaraan2:");
            beban = in.nextDouble();
        }
        
        if(!kendaraan2.addLoad(beban)){ //not true ===> false
            System.out.println("Beban kendaraan saat ini : "+ kendaraan2.getLoad()+" kg");
            System.out.println("Beban akan berlebih. Penambahan beban dibatalkan!");
        }else
            System.out.println("Beban kendaraan saat ini : "+ kendaraan2.getLoad()+" kg");
        
        //menampilkan beban kendaraan2 
        System.out.println("Beban kendaraan2 saat ini: "+ kendaraan2.getLoad()+" kg");
        
    }
}
