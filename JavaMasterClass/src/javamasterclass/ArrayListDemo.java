
package javamasterclass;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> number = new ArrayList<Integer>();
        
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            number.add(num);
        }
        
        for (int i : number) {
            System.out.println("Array contain: "+i);
        }
        
        int sz = number.size();
        System.out.println("Size"+sz);
        number.remove(sz - 2);
        System.out.println("After Remove"+number);
        
    }
}
