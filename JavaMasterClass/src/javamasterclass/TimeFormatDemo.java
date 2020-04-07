
package javamasterclass;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormatDemo {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.now();
        
        DateTimeFormatter timeFormater = DateTimeFormatter.ofPattern("hh:mm:ss");
        String currentTm = lt.format(timeFormater);
        System.out.println(currentTm);
        
    }
}
