package DemoInCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

    public static void main(String[] args) {

        List<Student> students=new ArrayList<>();
        students.add(new Student("Anisha",9));
        students.add(new Student("Ayisha",3));
        students.add(new Student("Mohammad", 6));

        System.out.println("before sorting" +students);

        Collections.sort(students,new AgeComparator());

        System.out.println("After sorting: "+students);


    }
}

class Student{

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "Student{"+
                "name="+name+'\''+
                ", age="+age+
                '}';
    }

}

class AgeComparator implements Comparator<Student>{
    @Override
    public int compare(Student stu1, Student stu2){
        return stu1.age-stu2.age;
    }
}


