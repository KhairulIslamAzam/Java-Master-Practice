import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainMethod {
    public static void main(String[] args) {
        MotherBoard motherBoard = new MotherBoard("ac15",2,4);
        Dimention dimention = new Dimention(12,15.5,10);
        Case theCase = new Case("june-12-2018","5V",dimention);
        Monitor monitor = new Monitor(motherBoard, theCase);
        System.out.println(monitor.getTheCase().getManufacture());
        monitor.getMotherBoard().setCardSlot(6);

    }
}
