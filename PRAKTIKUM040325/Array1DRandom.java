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


public class Array1DRandom {
    public static void main(String[] args){
        int A[], n, i, banyak=0, jumlah=0;
        Scanner in = new Scanner(System.in);
        Random rand =  new Random();
        System.out.print("Masukan banyak data : ");
        n = in.nextInt();
        A = new int[n]; //A ukuran n
        System.out.println("== Data Anda ==");
        for(i=0; i<n; i++)
        {
            A[i] = rand.nextInt(10)+1;
            System.out.print(A[i]+"\t");
        }
        System.out.print("\n== Data genap ==\n");
        for(i=0; i<n; i++)
        {
            if(A[i]%2==0)
            {
                System.out.print(A[i]+"\t");
                banyak++; //banyak = banyak + 1
                jumlah = jumlah + A[i]; // jumlah+= A[i]
            }
        }
        System.out.print("\nBanyak Genap : "+banyak);
        System.out.print("\nJumlah Genap : "+jumlah);
        
        System.out.println();
    }
}
