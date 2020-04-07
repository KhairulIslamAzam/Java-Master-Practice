
package Encapsulation;

public class EncapMain {
    public static void main(String[] args) {
        Encap ec = new Encap();
        ec.setValue(10, "azam");
        
        System.out.println("Number is "+ec.getNum());
        System.out.println("name is "+ec.getName());
    }
}
