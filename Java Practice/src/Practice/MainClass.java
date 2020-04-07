package Practice;

public class MainClass{
    public static void main(String[] args) {
//        FirstClass firstClass = new FirstClass("azam", 20);
//        firstClass.location = "Banskhali";
//        FirstClass.headOffice = "Agrabad";
//        firstClass.display();
//        firstClass.privateDisplay();
        TestThree testThree = new TestThree();
        //TestFour testFour = new TestFour();
//        testThree.brunchName = "Chattogram";
//        testThree.employeeNumber = 15;
//        testThree.setName("Kalam");
//        testThree.dispInfo();
//        System.out.println("---------");
//        testThree.setNumber(101);
//        testThree.dispInfo();
//        System.out.println("---------");
//        testFour.setTrnasection(1000);
//        testFour.setName("azam");
//        testFour.setNumber(102);
//        testFour.display();
          testThree.transectionOccur = 2;
          TestThree testThreeTow = new TestThree();
          testThreeTow.transectionOccur = 5;
          testThree.ckTransection(testThreeTow);
          TestThree newTest =new TestThree();
          newTest.transectionSize = 10;
          newTest.transectionOccur = 4;
          newTest.NewTransectionSite(testThreeTow);
    }
}
