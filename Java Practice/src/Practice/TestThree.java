package Practice;

public class TestThree {
    private int number;
    private String name;
    protected String brunchName;
    int employeeNumber;
    public int transectionSize =5;
    public int transectionOccur;

    public void ckTransection(TestThree testThreeTwo){
        int total = this.transectionOccur + testThreeTwo.transectionOccur;
        if(total>transectionSize){
            System.out.println("Transection Overflow");
            extendTransectionSize(transectionSize);
            total = this.transectionOccur + testThreeTwo.transectionOccur;
            System.out.println("After extend "+total);
        }else{
            System.out.println("Total transection "+total);
        }
    }

    public int extendTransectionSize(int size){
        return this.transectionSize = size + 10;
    }

    public TestThree NewTransectionSite(TestThree testThree){
        TestThree testThree1 = new TestThree();
        this.transectionSize = transectionSize;
        ckTransection(testThree);
        return testThree1;

    }

    public int dailyView;

    private int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void dispInfo(){
        System.out.println("Id Number "+number);
        System.out.println("Customer Name "+name);
        System.out.println("Branch "+brunchName);
        System.out.println("Total Employee "+employeeNumber);
        System.out.println("Daily View "+dailyView);
    }
}
