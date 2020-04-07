package HashMap;
public class HashMap {
    public static void main(String[] args) {
        java.util.HashMap<Integer, String> customer = new java.util.HashMap<Integer, String>();
        customer.put(101, "khairul");
        customer.put(102, "Islam");
        customer.put(103, "Azam");

        System.out.println("Size of the Customer Dictionary "+customer.size());
        for (int i = 1; i <= customer.size(); i++){
            Integer j = 101;
            System.out.println("Customerid " + j + "  name " + customer.get(j));
            j++;
        }
    }
}
