
package javamasterclass;

import java.util.Scanner;

public class ConditionalStatement {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
       int number;
       number = sc.nextInt();
       
       if(number %2 ==0){
           System.out.printf("The %d number is Even\n10", number);
       }
       else{
           System.out.printf("The %d number is Odd\n", number);
       }
       
   } 
}
