
package Abstraction;

public class MainMethod {
    public static void main(String[] args) {
        Shape sp;
        double pi = Math.PI;
        
        Rectangle r = new Rectangle(10,3);
        sp = new Rectangle(10.5,5.5);
        
        r.area();
        sp.area();
        //System.out.println("pi "+pi);
        sp = new Circle(5.0, pi);
        sp.area();
    }
}
