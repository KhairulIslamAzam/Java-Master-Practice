
package Interface;

public class Dog implements Animal,InterfaceTwo {
    
    @Override
    public void eat(){
        System.out.println("This is from dog");
    }
}
