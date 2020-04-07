
package SuperKeyWord;

public class Vehicle {
    String color;
    double weight;
     
    Vehicle(String c, double w){
        color = c;
        weight = w;
    }
    
    void display(){
        System.out.println("Color of vehicle "+color);
        System.out.println("Weight of the vehicle "+weight);
    }
}
