package javamasterclass;

import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int number;
        //number = sc.nextInt();
        String name;
        String fname;
        System.out.println("Enter the name ");
        name = sc.next();
        System.out.println("Enter the Full name ");
        fname = sc.nextLine();
        System.out.println("The number is: "+number);
    }
}
