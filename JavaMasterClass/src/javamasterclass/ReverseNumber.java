
package javamasterclass;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num,r;
        num = sc.nextInt();

        System.out.println("Original Number"+num);
        while(num>0){
            r = num % 10;
            System.out.printf("%d",r);
            num = num / 10;
        }
        
    }
}
