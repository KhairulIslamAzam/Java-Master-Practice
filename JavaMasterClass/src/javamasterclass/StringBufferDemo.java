
package javamasterclass;

import java.util.Scanner;

public class StringBufferDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        StringBuffer sb = new StringBuffer("Khairul");
        
        /* In stringBUffer you can easily expand from orginal Sttring
        any thing can append in String Buffer
        */
        sb.append(" Islam ");
        sb.append(10);
        System.out.println(sb);
        
        sb.delete(0, 5);
        System.out.println(sb);
    }
}
