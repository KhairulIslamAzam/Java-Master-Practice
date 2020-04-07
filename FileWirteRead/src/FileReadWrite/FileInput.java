package FileReadWrite;

import java.util.Formatter;
import java.util.Scanner;

public class FileInput {
    public static void main(String[] args) {
        String name;
        int age;
        try{
            Formatter formatter = new Formatter("C:/Users/khair/Desktop/Java/FileWirteRead/FileFolder/textFileOne.txt");
            Scanner sc = new Scanner(System.in);
            for (int i =0; i<4; i++){
                System.out.print("Enter Name and the age: ");
                name = sc.next();
                age = sc.nextInt();
                formatter.format("%s %s\r\n", name, age);
            }
            formatter.close();

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
