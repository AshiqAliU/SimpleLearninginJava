package AccessModifierDemo;

public class AMDemo {

    public static void main(String args[]){
        PersonIntroduction personIntroduction=new PersonIntroduction(123,"ABCD",20);
        System.out.println(personIntroduction.name);
        //System.out.println(personIntroduction.);
        personIntroduction.introduce();

        Student student =new Student(123,"xyz",12);
        student.showAge();


    }

}
