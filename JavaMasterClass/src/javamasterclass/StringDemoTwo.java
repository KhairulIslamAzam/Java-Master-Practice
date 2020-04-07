
package javamasterclass;

import java.util.Scanner;

public class StringDemoTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = "Khairul Islam Azam";
        String s2 = new String("  Khairul Islam     Azam   " );
        
        char chh = s1.charAt(0);
        int number = s1.codePointAt(0);
        int s_pos = s1.indexOf("Islam");
        int l_pos = s1.lastIndexOf('a');
        
        System.out.println(chh);
        System.out.println(number);
        System.out.println(s_pos);
        System.out.println(l_pos);
        System.out.println(s2.trim());
        
        String[] s3 = s1.split(" ");
        
        for (String i: s3) {
            System.out.println(i);
        }
    }
}
