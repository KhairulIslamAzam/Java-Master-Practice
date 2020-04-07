package Static;

public class StaticBlockDemo {
    static int a;
    static String name;
    static{
        a = 10;
        name = "Azam";
    }
    
    void display(){
        System.out.println(a +" "+ name);
    }
}
