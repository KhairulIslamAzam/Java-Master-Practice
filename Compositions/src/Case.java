public class Case {
    private String manufacture;
    private String powerSupply;
    private Dimention dimention;

    public Case(String manufacture, String powerSupply, Dimention dimention) {
        this.manufacture = manufacture;
        this.powerSupply = powerSupply;
        this.dimention = dimention;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    public Dimention getDimention() {
        return dimention;
    }

    public void setDimention(Dimention dimention) {
        this.dimention = dimention;
    }
    public void motherDisp(){
        System.out.println("case");
    }
}
