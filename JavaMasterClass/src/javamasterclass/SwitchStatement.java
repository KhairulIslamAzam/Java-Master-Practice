
package javamasterclass;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char car;
        car = sc.next().charAt(0);
        switch(car){
            case 'a':
                 System.out.printf("%c is Vowel", car);
                 break;
            case 'i':
                 System.out.printf("%c is Vowel", car);
                 break;
            case 'e':
                 System.out.printf("%c is Vowel", car);
                 break;
            case 'o':
                 System.out.printf("%c is Vowel", car);
                 break;     
            case 'u':
                 System.out.printf("%c is Vowel", car);
                 break;
            default:
                System.out.printf("%c is Consunent", car);
        }
    }
}
