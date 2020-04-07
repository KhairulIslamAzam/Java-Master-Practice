
package javamasterclass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormateDemo {
    public static void main(String[] args) {
        Date date = new Date();
       // System.out.println(date);
       //String pattern = "MM-dd-yyyy";
       //DateFormat simpleDateFormat = new SimpleDateFormat(pattern);
      
        SimpleDateFormat dateFormate = new SimpleDateFormat("dd/MM/YYYY");
        String currentDate = dateFormate.format(date);
        
        System.out.println(currentDate);
    }
}
