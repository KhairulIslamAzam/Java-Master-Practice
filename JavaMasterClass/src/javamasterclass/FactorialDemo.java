
package javamasterclass;

import java.util.Scanner;

public class FactorialDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, fact=1;
        num = sc.nextInt();
        
        int i=num;
        while(i>0){
            fact = fact*i;
            i--;
                    
        }
        System.out.printf("Factorial of %d = %d", num, fact);
    }
}
