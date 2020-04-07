package Practice;

public class TestOne {

        String name;
        int age;
        int roll;

        TestOne(String name, int age){
            this.name = name;
            this.age = age;
        }
        TestOne(String name, int age, int roll){
            this(name, age);
            this.roll = roll;
        }

        public void display(){

            System.out.println("Super  Class name "+name);
            System.out.println("Super class name "+age);
        }

        public void message(){
            System.out.println("Normal method from supper class");
        }

    public abstract static class Abs {
        abstract void display();
        void message(){
            System.out.println("From abs");
        }
    }
}
