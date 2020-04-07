public class StringDemo {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
//        String name = "Azam";
//        String name2 = "Khairul";
//        String name1 = new String("Azam");
//        Stream<String> name3 = new String("Azam \nkdjflk lkjdfa \nkldl").lines();
//        name3.forEach(System.out :: println);
        //boolean bt = name2.endsWith("l");
        //System.out.println(name3.lines());
        //System.out.println(bt);
//        if(name == name2){
//            System.out.println("Yes");
//        }
//        int bl=  name1.compareTo("Azam");
//        System.out.println(bl);
//        if(name.charAt(0)){
//            System.out.println("new Object");
//        }
//        else{
//            System.out.println("No");
//        }

        StringBuffer stringBuffer = new StringBuffer();
        //StringBuffer stringBuffer = new StringBuffer("")
        stringBuffer = new StringBuffer("Khairul islam azam");
        //int cap = stringBuffer.capacity();
        //System.out.println(cap);
        stringBuffer.insert(12,"azam");
        System.out.println(stringBuffer);
    }
}
