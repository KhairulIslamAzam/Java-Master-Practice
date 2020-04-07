
package Static;

public class Staticmethod {
    
    
    void displayOne(){
        /* from non static method
        static method can call
        */
        displayTwo();
        System.out.println("THis method is non Static");
    }
    static void displayTwo(){
        /*
        from static method 
        no non static method can call
        */
        
        //displayOne();
        System.out.println("THis is static method");
    }
}
