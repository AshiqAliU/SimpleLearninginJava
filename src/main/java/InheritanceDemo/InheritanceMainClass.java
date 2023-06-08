package java.InheritanceDemo;

public class InheritanceMainClass {


    public static void main(String[] args) {
        Dog myDog=new Dog("Fido");
        myDog.eat();
        myDog.sleep();
        myDog.bark();

        Cat myCat=new Cat("Tin");
        myCat.eat();
        myCat.sleep();
        myCat.meow();

    }
}
