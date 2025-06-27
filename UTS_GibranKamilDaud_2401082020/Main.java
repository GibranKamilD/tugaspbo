/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_GibranKamilDaud_2401082020;
import UTS_GibranKamilDaud_2401082020.Taksi;
import java.util.Scanner;
/**
 *
 * @author gibra
 */
public class Main {
    public static void main(String[] args){
        int jmlRoda, tarifAwal, tarifPerKm, kapasitasMesin;
        String warna, bahanBakar;
        Scanner in = new Scanner(System.in);
        Taksi taksi = new Taksi();

        
        System.out.print("Masukkan jenis bahan bakar: ");
        bahanBakar = in.nextLine();
        taksi.setBahanBakar(bahanBakar);

        System.out.print("Masukkan warna: ");
        warna = in.nextLine();
        taksi.setWarna(warna);
        
        System.out.print("Masukkan jumlah roda: ");
        jmlRoda = in.nextInt();
        taksi.setJmlRoda(jmlRoda);
        

        System.out.print("Masukkan kapasitas mesin (cc): ");
        kapasitasMesin = in.nextInt();
        taksi.setKapasitasMesin(kapasitasMesin);
        
        System.out.print("Masukkan tarif per km: ");
        tarifPerKm = in.nextInt();
        taksi.setTarifPerKm(tarifPerKm);

        System.out.print("Masukkan tarif awal: ");
        tarifAwal = in.nextInt();
        taksi.setTarifAwal(tarifAwal);

        System.out.print("Masukkan jarak tempuh (km): ");
        int jarak = in.nextInt();

        
        int totalBayar = tarifAwal + (tarifPerKm * jarak);
        
        
        System.out.println("\n\n=== INFORMASI TAKSI ===");
        System.out.println("Jumlah Roda     : " + taksi.getJmlRoda());
        System.out.println("Warna           : " + taksi.getWarna());
        System.out.println("Kapasitas Mesin : " + taksi.getKapasitasMesin() + " cc");
        System.out.println("Bahan Bakar     : " + taksi.getBahanBakar());
        System.out.println("Tarif Awal      : Rp" + taksi.getTarifAwal());
        System.out.println("Tarif Per Km      : Rp" + taksi.getTarifPerKm());
        System.out.println("Jarak tempuh      : " + jarak + " Km");
        System.out.println("Total pembayaran      : Rp" + totalBayar);
    }
}
