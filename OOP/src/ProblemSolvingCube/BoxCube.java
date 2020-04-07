
package ProblemSolvingCube;

public class BoxCube {
    private double height, width, depth;
    private double result;
    static int a;
    public BoxCube(double height, double width, double depth){
        this(height,width);
        this.depth = depth;
    }
    
    
    
    public  void calculatedArea(){
        result = .5*((height+width)/depth);
        System.out.println("The area of the box: "+result);
    }
    
}
