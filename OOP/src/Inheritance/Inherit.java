
package Inheritance;

public class Inherit {
    private int salary;
    String employeeName;
    
    public void setSalary(int salary){
        this.salary = salary;
    }
    
    public int getSalary(){
        return salary;
    }
    
    void display(){
        System.out.println("Salary "+salary);
        System.out.println("Employye Name "+employeeName);
    }
}
