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
public class PersegiPanjangEnkapsulasi {
    private int panjang;
    private int lebar;
    private static int jumlahObjek = 0;
    
        //konstruktor default
        public PersegiPanjangEnkapsulasi(){
        this.panjang = 0;
        this.lebar = 0;
        jumlahObjek++;
        }
        
        //Konstruktor dengan parameter
        public PersegiPanjangEnkapsulasi(int panjangBaru, int lebarBaru){
            this.panjang = panjangBaru;
            this.lebar = lebarBaru;
            jumlahObjek++;
        }
        
        //Setter dan getter untuk panjang
        public void setPanjang(int panjangBaru){
            this.panjang = panjangBaru;
        }
        
        public int getPanjang(){
            return panjang;
        }

        //Setter dan getter untuk lebar
        public void setLebar(int lebarBaru){
            this.lebar = lebarBaru;
        }
        
        public int getLebar(){
            return lebar;
        }
        
        //Getter untuk Jumlah Objek
        public static int getJumlahObjek(){
            return jumlahObjek;
        }
        
        //Method untuk menghitung Luas
        public int getLuas(){
            return panjang * lebar;
        }
        
        public int getKeliling(){
            return 2 * (panjang + lebar);
        }
}
