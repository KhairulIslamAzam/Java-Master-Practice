
package FinalKeyword;

public class University {
    String university = "IIUC";
    final int regNo;
    static final int id;
    
    //final keyword initialize by default constructor
    University(){
        regNo = 10;
    }
    
    //static final keyrowrd initailize by static block
    static{
        id = 10;
    }
    
    void display(){
        System.out.println("University "+university);
        System.out.println("Final regno "+regNo);
        System.out.println("static final key "+id);
    }
    
}
