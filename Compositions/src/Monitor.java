public class Monitor {
    private MotherBoard motherBoard;
    private Case theCase;

    public Monitor(MotherBoard motherBoard, Case theCase) {
        this.motherBoard = motherBoard;
        this.theCase = theCase;
    }

    public void display(){
        motherBoard.motherDisp();
        theCase.motherDisp();
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public Case getTheCase() {
        return theCase;
    }

}
