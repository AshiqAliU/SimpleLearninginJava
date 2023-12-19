package AccessModifierDemo;

public class Student extends PersonIntroduction{
    public Student(int id, String name, int age){
        super(id, name,age);
    }

    public void showAge(){
        System.out.println("I am  "+age+" years old ");
    }

}
