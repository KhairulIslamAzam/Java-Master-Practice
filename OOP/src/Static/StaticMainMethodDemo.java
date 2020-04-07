
package Static;

import java.util.Scanner;

public class StaticMainMethodDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //StaticDemo sd = new StaticDemo("Khairul", "CSE");
        
        //sd.DisplayInfo();
        
        /*Accessing static variaable by 
         Static Class name not by object name
        */
        //System.out.println("Static Variable Univeristy "+StaticVariableAccess.universityName);
    
        /*
        StaticCount scc = new StaticCount();
        scc.totalCount();
        
        StaticCount scc1 = new StaticCount();
        scc1.totalCount();
        
        StaticCount scc2 = new StaticCount();
        scc2.totalCount();
        */
        
        /*
        Staticmethod sm = new Staticmethod();
        sm.displayOne();
        Staticmethod.displayTwo();
        */
        StaticBlockDemo sbd = new StaticBlockDemo();
        sbd.display();
    }
}
