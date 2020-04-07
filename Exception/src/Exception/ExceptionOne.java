package Exception;

public class ExceptionOne {

    public static void main(String[] args) {
        try{
            int x=10,y=0;
            double result;
            result = x/y;
        }catch(Exception e){
            System.out.println("Exception is "+ e);
        }
    }
}
