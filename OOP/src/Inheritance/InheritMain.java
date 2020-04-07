
package Inheritance;

public class InheritMain {
    public static void main(String[] args) {
        Inherit in1 = new Inherit();
        InheritTwo in2 = new InheritTwo();
        
        in2.employeeName = "azam";
        
        in1.setSalary(100);
        int result = in1.getSalary();
        
        in2.bangkName = "IFIC";
        in2.salary1 = result;
        in2.display();
        
        
    }
}
