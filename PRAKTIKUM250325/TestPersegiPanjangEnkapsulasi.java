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
public class TestPersegiPanjangEnkapsulasi {
    public static void main(String[] args){
        System.out.println("Banyak objek awal : "+ PersegiPanjangEnkapsulasi.getJumlahObjek());
        
        PersegiPanjangEnkapsulasi PP1 = new PersegiPanjangEnkapsulasi();
        
        PersegiPanjangEnkapsulasi PP2 = new PersegiPanjangEnkapsulasi(10,5);
        
        System.out.println("Panjang : "+ PP2.getPanjang());
        System.out.println("Lebar : "+ PP2.getLebar());
        System.out.println("Luas : "+ PP2.getLuas());
        System.out.println("Lebar : "+ PP2.getKeliling());
        
        System.out.println("Banyak objek setelah : "+ PersegiPanjangEnkapsulasi.getJumlahObjek());
    }
    
}
