package InheritanceDemo;

public class Cat extends Animal {

    Cat(String name){
        super(name);
    }

    void meow(){
        System.out.println(name+" is Meow");
    }

}
