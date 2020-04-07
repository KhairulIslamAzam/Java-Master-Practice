
package Static;

public class StaticCount {
    static int count = 0;
    StaticCount(){
        count++;
    }
    
    void totalCount(){
        System.out.println("Total count of object "+count);
    }
}
