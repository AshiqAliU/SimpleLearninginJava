package java;

public class Person {

    String name;
    int age;

    Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    void introduce(){
        System.out.println("Hello, My name is "+name+" and I'm "+age+" years old");
    }

}
