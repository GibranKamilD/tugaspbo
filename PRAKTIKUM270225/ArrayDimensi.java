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
public class ArrayDimensi {
    public static void main(String[] args){
        int A[],n,i;
        Scanner in = new Scanner (System.in);
        System.out.print("Masukan banyak data : ");
        n = in.nextInt();
        A = new int[n];
        
        for(i=0; i<n; i++)
        {
            System.out.print("A["+i+"] = ");
            A[i] = in.nextInt();
        }
        int jumlah=0;
        
        for(i=0;i<n;i++)
            jumlah=jumlah+A[i];
        
        float rata = (float)jumlah/n;
        System.out.println("Isi array :");
        for(i=0;i<n;i++)
            System.out.print(A[i]+"\t");
        
        System.out.println("\nJumlah = "+jumlah);
        System.out.println("\nRata - rata = "+rata);
            
        int max = A[0];
        int min = A[0];
        
        for(i=1;i<n;i++)
        {
            if(A[i]>max)
            {
                max=A[i];
            }
            if(A[i]<min)
            {
                min=A[i];
            }
        }
        System.out.println("Nilai terbesar = "+max);
        System.out.println("Nilai terkecil = "+min);
        
        int imax= 0,imin = 0;
        for(i=1;i<n;i++)
        {
            if(A[i]>imax)
            {
                imax=i;
            }
            if(A[i]<imin)
            {
                imin=i;
            }
        }
        System.out.println("Nilai terbesar = "+A[imax]+" pada indeks = "+imax);
        System.out.println("Nilai terkecil = "+A[imin]+" pada indeks = "+imin);
    }
    
}
