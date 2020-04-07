
package javamasterclass;

import java.util.Scanner;

public class ConditionalOperator {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int number1, number2;
        number1 = sc.nextInt();
        number2 = sc.nextInt();
        
        int largeNum = (number1 > number2) ? number1 : number2;
        System.out.println(largeNum);
    }
}
