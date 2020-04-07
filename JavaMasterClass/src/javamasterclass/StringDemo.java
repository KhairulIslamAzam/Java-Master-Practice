
package javamasterclass;

import java.util.Scanner;


public class StringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = "Khairul Islam Azam";
        String s2 = new String("Khairul Islam Azam");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("Length of string "+s1.length());
        System.out.println("Upper case "+s1.toUpperCase());
        System.out.println("Empty or not "+s1.isEmpty());
        System.out.println("StartsWith "+s1.startsWith("Khairul"));
        System.out.println("Ends with "+s1.endsWith("Islam"));
    }
}
