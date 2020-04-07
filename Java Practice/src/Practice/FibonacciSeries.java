package Practice;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int result = 0, temp = 0;
        System.out.print("Enter number to see the sum of Fibonacci: ");
        int number = sc.nextInt();
        System.out.print(a + " " + b + " ");
        for (int i = 1; i < number; i++) {
            result = a + b;
            temp = b;
            a = b;
            b = result;
            System.out.print(b + " ");
            result = 0;
        }
        System.out.println();
    }
}
