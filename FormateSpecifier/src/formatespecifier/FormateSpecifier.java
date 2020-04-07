
package formatespecifier;


public class FormateSpecifier {

   
    public static void main(String[] args) {
        
        boolean b = true;
        float fl = 3.5f;
        int i = 1233;
        short shrt = 32;
        double dl = 3.4;
        char chh = 'c';
        
        System.out.println("Boolean "+b);
        System.out.printf("Boolean = %b\n",b);
        System.out.printf("float = %.2f\n", fl);
        System.out.printf("Double %f\n", dl);
    }
    
}
