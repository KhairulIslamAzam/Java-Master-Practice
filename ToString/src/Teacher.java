public class Teacher {
    String name;
    int age;

    Teacher(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Name: "+name+"\n"+"Age: "+age;
    }
}
