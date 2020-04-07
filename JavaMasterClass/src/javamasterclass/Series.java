
package javamasterclass;

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sum=0;
        num = sc.nextInt();
        
        for (int i = 0; i < num; i=i+2) {
            sum =sum+i;
        }
        System.out.println("The summation is: "+sum);
    }
}
