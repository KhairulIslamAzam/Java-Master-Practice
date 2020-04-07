
package Inheritance;


public class InheritTwo extends Inherit {
    String bangkName;
    int salary1;
   
    @Override
    void display(){
        System.out.println("EMployee Name "+ employeeName);
        System.out.println("Bank Name "+ bangkName);
        System.out.println("salary "+ salary1);
    }
}
