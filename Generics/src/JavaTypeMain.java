import java.util.Scanner;

public class JavaTypeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //sc.next();
        String n = new String(sc.next());
        //GenericType<Integer> genericType = new GenericType<>(a);
        //genericType.setRoll(a);
        // System.out.println(genericType.getRoll());
        /*GenericMultipleType<Integer,String> genericMultipleType = new GenericMultipleType<>(a,n);
        System.out.println(genericMultipleType.getRoll()+" "+genericMultipleType.getName());
        GenericMultipleType<String, String> genericMultipleType1 = new GenericMultipleType<>("Acc-101","Azam");
        System.out.println(genericMultipleType1.getRoll()+" "+genericMultipleType1.getName());
         */
        ParameterizedGenericType<GenericType<Integer>,String> parameterizedGeneric = new ParameterizedGenericType< >(new GenericType<>(a),n);
        System.out.println(parameterizedGeneric.getAccNo().getRoll()+" "+parameterizedGeneric.getName());

    }
}
