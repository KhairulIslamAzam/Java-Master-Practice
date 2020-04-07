import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferDemo {
    public static void main(String[] args) throws Exception {
        //int siz = 10;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        System.out.println(name);
        bufferedReader.close();
    }
}


