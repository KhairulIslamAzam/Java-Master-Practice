import java.lang.reflect.Constructor;

public class MotherBoard {
    private String model;
    private int ramSlot;
    private int cardSlot;

    public MotherBoard(String model, int ramSlot, int cardSlot) {
        this.model = model;
        this.ramSlot = ramSlot;
        this.cardSlot = cardSlot;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRamSlot() {
        return ramSlot;
    }

    public void setRamSlot(int ramSlot) {
        this.ramSlot = ramSlot;
    }

    public int getCardSlot() {
        return cardSlot;
    }

    public void setCardSlot(int cardSlot) {
        this.cardSlot = cardSlot;
    }

    public void motherDisp(){
        System.out.println("motherdisp");
    }

}
