package java.InheritanceDemo;

public class Dog extends Animal{

    Dog(String name){
        super(name); // call the constructor of the parent class - Animal class
    }

    void bark(){
        System.out.println(name+ " is barking");
    }

}
