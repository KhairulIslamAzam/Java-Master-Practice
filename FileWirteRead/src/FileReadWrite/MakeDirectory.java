package FileReadWrite;

import java.io.File;

public class MakeDirectory {
    public static void main(String[] args) {
        File dir = new File("C:/Users/khair/Desktop/Java/FileWirteRead/FileFolder");
        dir.mkdir();
        String directoryLocation = dir.getAbsolutePath();
        String directoryName = dir.getName();

        System.out.println("FIle path "+directoryLocation);
        System.out.println("Direcotry Name "+directoryName);

        //Deleting the created directory or folder
        /*
        if(dir.delete()){
            System.out.println("folder  "+directoryName+" is deleted successfully");
        }*/

    }
}
