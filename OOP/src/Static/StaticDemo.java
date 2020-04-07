
package Static;

public class StaticDemo {
      String teacherName, dept;
      static String univeristy  = "IIUC";
      
      StaticDemo(String tName, String dpt){
          teacherName = tName;
          dept = dpt;
      }
      
      void DisplayInfo(){
          System.out.println("Teacher name "+teacherName);
          System.out.println("Department "+dept);
          System.out.println("University Name "+univeristy);
      }
      
}
