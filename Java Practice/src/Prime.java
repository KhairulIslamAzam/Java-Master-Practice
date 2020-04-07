import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the test case number: ");
        int t = sc.nextInt();

        while (t > 0) {
            System.out.print("Enter the number ck to be prime or not: ");
            int primeNumber = sc.nextInt();

            if (primeNumber == 0) {
                System.out.println("Zero is Nutral Number");
            } else if (primeNumber == 1) {
                System.out.println(primeNumber + " is prime Number");
            } else {
                int ck = 1;
                for (int i = 2; i < primeNumber; i++) {
                    if (primeNumber % i == 0) {
                        ck = 0;
                    }
                }
                if (ck == 1) {
                    System.out.println(primeNumber + " is prime number");
                } else {
                    System.out.println(primeNumber + " is not prime number");
                }
            }
            t--;
        }
    }
}
