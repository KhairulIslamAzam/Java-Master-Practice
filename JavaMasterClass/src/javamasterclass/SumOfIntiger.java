
package javamasterclass;

import java.util.Scanner;

public class SumOfIntiger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,r,sum=0;
        num = sc.nextInt();
        
        while(num > 0){
            r = num%10;
            sum = sum+r;
            num = num/10;
        }
        
        System.out.println("The sum of Intiger is = "+sum);
    
    }
}
