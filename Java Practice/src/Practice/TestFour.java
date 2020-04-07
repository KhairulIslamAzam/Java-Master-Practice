package Practice;

public class TestFour extends TestThree {
    private double trnasection;

    public double getTrnasection() {
        return trnasection;
    }

    public void setTrnasection(double trnasection) {
        this.trnasection = trnasection;
    }

    public void display(){
       // System.out.println("id of customer "+getNumber());
        //System.out.println("CUsotmer name "+getName());
        System.out.println("Transection "+trnasection);
        System.out.println("Which branch "+brunchName);
        System.out.println("Number of Employee "+employeeNumber);
    }
}
