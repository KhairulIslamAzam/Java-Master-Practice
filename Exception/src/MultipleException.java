public class MultipleException {
    public static void main(String[] args) {
        try {
            int x=10,y=0;
            double result;
            //result = x/y;
            int [] num = new int[4];
            System.out.println(num[5]);
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e1){
            System.out.println(e1);
        }finally {
            System.out.println("Last line of the code");
        }
    }
}
