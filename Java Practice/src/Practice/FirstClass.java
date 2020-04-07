package Practice;

public class FirstClass {
    String name;
    int roll;
    private String acc;
    protected String location;
    public String subOffice;
    static String headOffice;

    public FirstClass(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public void display(){
        System.out.println("Name "+name);
        System.out.println("Roll "+roll);
        System.out.println("Location "+location);
        System.out.println("Head office "+headOffice);
    }
    public void privateDisplay(){
        System.out.println("Account "+acc);
    }
}
