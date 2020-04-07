
package ParameterizedMethod;

import java.util.Scanner;


public class AreaCal {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         double h, d,result;
         
         Area a = new Area();
         
         h = sc.nextDouble();
         d = sc.nextDouble();
         
         result = a.calculatedArea(h,d);
         
         System.out.println("The calculated area of: "+result);
         
         
         
    }
}
