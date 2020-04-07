package Practice;

public class InterfaceClass implements InterFace, InterfaceTwo {

    @Override
    public void area() {
        System.out.println("First Interface salary"+InterFace.salary);
        System.out.println("Second Interface salary"+InterfaceTwo.salary);
    }
}
