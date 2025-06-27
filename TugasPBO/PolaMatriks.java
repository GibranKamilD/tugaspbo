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
public class PolaMatriks {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n, i, j;
        
        System.out.print("Masukan ukuran pola matriks: ");
        n = in.nextInt();
        
        for(i = 0; i < n; i++){
            for(j=0; j<n; j++){
                if(i == j|| j == 0 || i == 0 ){
                    System.out.print("0 ");
                } else{  
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        
    }
}
