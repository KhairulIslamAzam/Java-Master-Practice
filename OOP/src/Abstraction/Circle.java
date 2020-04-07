
package Abstraction;

public class Circle extends Shape{
    double radius;
    double pi;
    double result;
    
    Circle(double r,double p){
        radius = r;
        pi = p;
    }
    
    @Override
    void area(){
        result = radius * pi;
        System.out.println("Circle "+result);
    }
   
}
