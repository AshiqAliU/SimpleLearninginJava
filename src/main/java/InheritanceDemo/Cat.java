package InheritanceDemo;

public class Cat extends Animal{

    Cat(String name){
        super(name);
    }

    @Override
    void eat(){
        System.out.println(name+" is eating and drinking");
    }

    void meow(){
        System.out.println(name+" is Meow");
    }

}
