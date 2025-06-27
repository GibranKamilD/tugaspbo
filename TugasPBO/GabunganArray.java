/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPBO;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author gibra
 */
public class GabunganArray {
    public static void main(String[] args){
        int A[], B[], C[], p, q, i;
        Scanner in = new Scanner(System.in);
        Random rn = new Random();
        
        // Input ukuran Array
        System.out.print("Masukkan ukuran array A: ");
        p = in.nextInt();
        A = new int[p];
        System.out.print("Masukkan ukuran array B: ");
        q = in.nextInt();
        B = new int[q];
        
        // Mengisi array dengan nilai random
        for (i = 0; i < p; i++){
            A[i] = rn.nextInt(100);
        }
        for (i = 0; i < q; i++){
            B[i] = rn.nextInt(100);
        }
        
        // Menentukan array yang lebih besar
        int r = p + q; // ukuran array C
        C = new int[r];
        r = 0; // Gunakan index terpisah
        
        if (p >= q) {
            for (i = 0; i < p; i++) {
                C[r++] = A[i];
            }
            for (i = 0; i < q; i++) {
                C[r++] = B[i];
            }
        } else {
            for (i = 0; i < q; i++) {
                C[r++] = B[i];
            }
            for (i = 0; i < p; i++) {
                C[r++] = A[i];
            }
        }
        
        // Menampilkan hasil
        System.out.print("Array A: ");
        for (i = 0; i < p; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.print("Array B: ");
        for (i = 0; i < q; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();

        System.out.print("Array C (Gabungan): ");
        for (i = 0; i < r; i++) {
            System.out.print(C[i] + " ");
        }
        System.out.println();
    }
}

