
package javamasterclass;

import java.util.Scanner;

public class LoopForEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] name = {"azam","kalim","Asif"};
        
        for(String x: name){
            System.out.println(x);
        }
    }
}
