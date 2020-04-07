
package javamasterclass;

import java.util.Scanner;

public class ConditionalStatement1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char car;
        car = sc.next().charAt(0);
        
        if ((car=='A' || car=='I' || car=='O'|| car=='U'||car=='E')||(car=='a' || car=='i' || car=='o'|| car=='u'||car=='e')){
            System.out.printf("%c is Vowel", car);
        }
        else{
            System.out.printf("%c is Consonent", car);
        }
    }
}
