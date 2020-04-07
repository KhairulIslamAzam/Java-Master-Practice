package javamasterclass;

import java.util.Scanner;

public class ArrayMaxNum {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num,sum=0,temp=-100000;
        int[] arraySum  = new int[10]; 
        num = sc.nextInt();
        
        for (int i = 0; i < num; i++) {
            arraySum[i] = sc.nextInt();
            
            if(temp < arraySum[i]){
                temp = arraySum[i];
            }
            
        }
        
        System.out.println("Maximum Number of the whole Array "+temp);
        
    }
}
