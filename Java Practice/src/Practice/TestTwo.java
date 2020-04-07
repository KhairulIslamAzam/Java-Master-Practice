package Practice;

public class TestTwo extends TestOne {
    int id;
    TestTwo(String name, int age , int id){
        super(name, age);
        this.id = id;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Value of supper class access"+id);
    }
}
