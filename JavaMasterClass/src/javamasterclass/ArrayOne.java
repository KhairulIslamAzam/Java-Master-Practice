
package javamasterclass;

import java.util.Scanner;

public class ArrayOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num,sum=0,temp=1;
        int[] arraySum  = new int[10]; 
        num = sc.nextInt();
        
        for (int i = 0; i < num; i++) {
            arraySum[i] = sc.nextInt();
           
            sum = sum + arraySum[i];
        }
        
        System.out.println("Sum of the whole Array "+sum);
        System.out.println("Avg of the array "+(double)sum/num+" "+num);
    }
}
