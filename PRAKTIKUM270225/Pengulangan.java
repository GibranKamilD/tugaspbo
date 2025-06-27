/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRAKTIKUM270225;


/**
 *
 * @author Lab-J2-01
 */
import java.util.Scanner;

public class Pengulangan {
    public static void main(String[] args){
        int n,i;
        Scanner in = new Scanner(System.in);
        System.out.println("=== Program Pengulangan ===");
        System.out.print("Masukan banyak pengulangan : ");
        n = in.nextInt();
        System.out.println("--- Pengulangan for ---");
        for(i=1; i<=n;i++)
            System.out.print(i+"\t");
        //endfor
        System.out.println("\n--- Pengulangan While ---");
        i=1;
        while(i<=n)
        {
            System.out.print(i+"\t");
            i++;
        }
        System.out.println("\n--- Pengulangan Do-While ---");
        i=1;
        do
        {
            System.out.print(i+"\t");
            i++;
        }while(i<=n);
    }
}
    

