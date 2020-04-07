package javamasterclass;

import java.util.Scanner;

public class Traingle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double area, length, width;
        length = sc.nextDouble();
        width = sc.nextDouble();
        
        area = 0.5* length * width;
        
        System.out.println("The traingle of area is "+area);
    }
}
