/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Tugas25032025;

/**
 *
 * @author User
 */
public class BankNasabahTabunganTests {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Nasabah nasabah1 = new Nasabah("Rahmat", "Rival");
        Tabungan tabungan1 = new Tabungan(8000);
        nasabah1.setTabungan(tabungan1);

        Nasabah nasabah2 = new Nasabah("Rival", "Rahmat");
        Tabungan tabungan2 = new Tabungan(3000);
        nasabah2.setTabungan(tabungan2);

        System.out.println("Informasi nasabah dan saldo");
        System.out.println("===============================");
        System.out.println(nasabah1);
        System.out.println(nasabah2);
        System.out.println();
        
        System.out.println("Riwayat menabung nasabah");
       
        tabungan1.simpanUang(6000);
        System.out.println("Setelah Rahmat menabung 6000: " + tabungan1.getSaldo());

        tabungan2.simpanUang(9000);
        System.out.println("Setelah Rival menabung 9000: " + tabungan2.getSaldo());

        System.out.println("\nRiwayat penarikan nasabah");

        tabungan1.ambilUang(3000);
        System.out.println("Setelah Rahmat mengambil 3000: " + tabungan1.getSaldo());

        tabungan2.ambilUang(4000);
        System.out.println("Setelah Rival mengambil 4000: " + tabungan2.getSaldo());

        tabungan2.transfer(tabungan1, 2000);
        System.out.println("\nSetelah Rahmat transfer 2000 ke Rival:");
        System.out.println("Saldo Rahmat: " + tabungan1.getSaldo());
        System.out.println("Saldo Rival: " + tabungan2.getSaldo());
        

    
    }
    
}
