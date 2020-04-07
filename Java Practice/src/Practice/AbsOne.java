package Practice;

public class AbsOne extends Abs {

    @Override
    void displayOne() {
        super.message();
        System.out.println("From Abs One");
    }

    @Override
    void message() {
        System.out.println("from abs one");
    }
}
