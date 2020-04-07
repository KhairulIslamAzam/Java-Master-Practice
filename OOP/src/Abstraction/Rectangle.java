
package Abstraction;

public class Rectangle extends Shape {
    double height;
    double width;
    double result;
    Rectangle(double h, double w){
        height = h;
        width = w;
    }
    @Override
    void area(){
        result = (height * width);
        System.out.println("Rectangle "+result);
    }
    

}
