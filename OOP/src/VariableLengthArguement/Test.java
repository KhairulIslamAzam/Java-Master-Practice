
package VariableLengthArguement;

public class Test {
    int sum =0;
    
    void sumOf(int ... num){
        for(int x: num){
            sum = sum +x;
        }
        
        System.out.println("SUm of total value of argument "+sum);
    }
}
