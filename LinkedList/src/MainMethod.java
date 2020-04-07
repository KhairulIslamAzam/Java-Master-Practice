import java.util.LinkedList;

public class MainMethod {
    public static void main(String[] args) {
        LinkedList<Student> listStudent = new LinkedList<Student>();
        Student s = new Student("azam  ",12);
        Student s1 = new Student("azam  ",12);
        Student s2 = new Student("azam  ",12);
        Student s3 = new Student("azam  ",12);
        listStudent.add(s);
        listStudent.add(s1);
        listStudent.add(s2);
        listStudent.add(s3);
        String [] num = {"azam"};
         for ( Student st : listStudent){
            System.out.println("Name "+s.name+" "+"roll "+s.roll);
        }

    }
}
