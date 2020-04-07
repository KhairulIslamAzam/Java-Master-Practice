
package SuperKeyWord;

public class Car extends Vehicle
{
   int gear;

   Car(String c, double w, int g){
       super(c,w);
       gear = g; 
   }

   @Override
   void display(){
       super.display();
       System.out.println("Gear of the vechicle "+gear);
   }
}
