
package javamasterclass;

import java.util.Scanner;

public class Array2dMatrixAd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] a = new int [10][10];
        int[][] b = new int [10][10];
        int[][] c = new int [10][10];
        
        System.out.println("Enter Array input ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <5 ; j++) {
                a[i][j] = sc.nextInt();
                b[i][j] = a[i][j];
            }
        }
        
        System.out.println("Array A");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <5 ; j++) {
                System.out.printf("%d \t",a[i][j]);
            }
            System.out.println();
        }
        System.out.println("Array B");
         for (int i = 0; i < 5; i++) {
            for (int j = 0; j <5 ; j++) {
                System.out.printf("%d \t",b[i][j]);
            }
             System.out.println();
        }
         
         
        for (int i = 0; i < 5; i++) {
            for (int j = i; j <=i ; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
             
        }
         
         System.out.println("Array Sum");
         for (int i = 0; i < 5; i++) {
            for (int j = 0; j <5 ; j++) {
                System.out.printf("%d \t",c[i][j]);
            }
             System.out.println();
        }
    }
}
