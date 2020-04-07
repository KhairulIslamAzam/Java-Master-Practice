
package Encapsulation;

public class Encap {
   private int num;
   private String name;
   
   public void setValue(int num, String name){
       this.num = num;
       this.name = name;
   }
   
   public int getNum(){
       return num;
   }
    public String getName(){
       return name;
   }
}
