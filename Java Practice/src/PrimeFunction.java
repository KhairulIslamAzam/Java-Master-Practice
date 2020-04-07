import java.util.Scanner;

public class PrimeFunction {
    public static int ckPrime(int number){
        if(number == 0){
            return 0;
        }
        else if(number == 1){
            return 1;
        }
        else{
            for(int i = 2; i<number;i++){
                if(number % i == 0){
                    return -1;
                }
            }
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter test case number ");
        int t = sc.nextInt();
        while (t>0){
            System.out.print("\n Enter number ck to be prime or not");
            int primeNumber = sc.nextInt();
            int result = ckPrime(primeNumber);

            if(result == 0){
                System.out.println("Zero is Nutral Number");
            }
            else if(result == 1){
                System.out.println(primeNumber+" is not prime Number");
            }
            else {
                System.out.println(primeNumber +" is not prime number");
            }
            t--;
        }

    }

}
