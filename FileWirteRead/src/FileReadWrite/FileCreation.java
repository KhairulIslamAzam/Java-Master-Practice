package FileReadWrite;
import FileReadWrite.MakeDirectory;
import java.io.File;

public class FileCreation {
    public static void main(String[] args) {

        File file1 = new File("C:/Users/khair/Desktop/Java/FileWirteRead/FileFolder/textFileOne.txt");
        File file2 = new File("C:/Users/khair/Desktop/Java/FileWirteRead/FileFolder/textFileTwo.txt");

        try {
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("File created successfully");
        }catch (Exception e){
            System.out.println("Exception is "+e);
        }
    }
}
