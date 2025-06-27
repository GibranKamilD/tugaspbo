/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRAKTIKUM040325;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author gibra
 */
public class Array2DRandom {
    public static void main(String[] args)
    {
        // TODO code application logic here
        int M[][];
        int N[][];
        int Hasil[][];
        int i, j, b, k, p, q;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Masukan jumlah baris 1 : ");
        b = in.nextInt();
        System.out.print("masukan jumlah kolom 1 : ");
        k = in.nextInt();
        M = new int[b][k];
        System.out.print("Masukan jumlah baris 2 : ");
        p = in.nextInt();
        System.out.print("masukan jumlah kolom 2 : ");
        q = in.nextInt();
        N = new int[p][q];
        // mengisi Array 2 Dimensi secara random
        System.out.println("== Isi Matriks 1 == ");
        int a = 0;
        for(i=0;i<b;i++){
            for(j=0;j<k;j++){
                M[i][j] = rand.nextInt(10)+1;
                System.out.print(M[i][j]+"\t");
            }
            System.out.println("\n");
        }
        
        System.out.println("== Isi Matriks 2 == ");
        for(i=0;i<p;i++){
            for(j=0;j<q;j++){
                N[i][j] = rand.nextInt(10)+1;
                System.out.print(N[i][j]+"\t");
            }
            System.out.println("\n");
        }
        System.out.println("== Penjumlahan matriks == ");
        
       if(b==p && k==q)
       {
           Hasil = new int[b][k];
           System.out.println("Hasil Penjumlahan Matriks");
           for(i=0;i<b;i++)
           {
               for(j=0;j<k;j++)
               {
                   Hasil[i][j]= M[i][j] + N[i][j];
                   System.out.print(Hasil[i][j]+"\t");
               }
           }
       }
       else
       {
           System.out.println("Ukuran matriks beda, tidak bisa dijumlahkan");
       }
        
        
    }
}
