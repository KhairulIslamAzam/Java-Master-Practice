
package CallbyValueAndReference;

public class MainMethodDemo {
    public static void main(String[] args) {
        CallByValue cb = new CallByValue();
        CallByRef cr = new CallByRef();
        
        //this code show the call by value
        int x = 10;
        System.out.println("value of x before call "+x);
        cb.change(x);
        System.out.println("value of x after call "+x);
        
        //call by refence
        cr.name= "khairul";
        System.out.println("value of name before call "+cr.name);
        
        cr.change(cr);
        System.out.println("value of name after call "+cr.name);
        
    }
}
