
package javamasterclass;

import java.util.Scanner;

public class WrapperDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =10;
        
        Integer y = x; //autoboxingz
        System.out.println(y);
        
        Double z = 10.5;
        double z1 = z;//unboxing
        System.out.println(z1);
        
        
        
    }
}
