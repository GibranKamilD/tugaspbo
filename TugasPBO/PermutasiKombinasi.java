/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPBO;
import java.util.Scanner;
/**
 *
 * @author gibra
 */
public class PermutasiKombinasi {
    public static void main(String[] args) {
        int a, b, i, P = 1, C, g = 1, f = 1;
        Scanner in = new Scanner(System.in);
        
        // Input nilai n dan r dari pengguna
        System.out.print("Masukkan nilai a: ");
        a = in.nextInt();
        System.out.print("Masukkan nilai b: ");
        b = in.nextInt();
        
        // Menghitung faktorial n
        for (i = 1; i <= a; i++) {
            P *= i;
        }
        
        // Menghitung faktorial (a - b)
        for (i = 1; i <= (a - b); i++) {
            f *= i;
        }
        
        // Menghitung permutasi
        P /= f;
        
        // Menghitung faktorial b
        for (i = 1; i <= b; i++) {
            g *= i;
        }
        
        // Menghitung kombinasi
        C = P / g;
        
        // Menampilkan hasil
        System.out.println("Permutasi P(" + a + ", " + b + ") = " + P);
        System.out.println("Kombinasi C(" + a + ", " + b + ") = " + C);
        
        in.close();
    }
    
}
