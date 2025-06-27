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
public class ArrayPola1 {
    public static void main(String[] args)
    {
        int i, j, n;
        Scanner in = new Scanner(System.in);
        System.out.println("Nomor 1");
        System.out.print("Masukan Jumlah baris :  "); 
        n = in.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println("Nomor 2");
        System.out.print("Masukan Jumlah baris : ");
        n = in.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=i;j<n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println("Nomor 3");
        System.out.print("Masukan Jumlah baris : ");
        n = in.nextInt();
        int a = 0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a++;
                System.out.print(" "+a+" ");
            }
            System.out.println();
        }
        System.out.println("Nomor 4");
        System.out.print("Masukan Jumlah baris : ");
        n = in.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(" "+a+" ");
                a--;
            }
            System.out.println();
        }
        
    }
    
}
