
package javamasterclass;

import java.util.Scanner;



public class StringBufferOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "Khairul";
        StringBuffer sb = new StringBuffer(name);
        String rName = sb.reverse().toString();
        System.out.println(name);
        System.out.println(rName);
        
    }
}
