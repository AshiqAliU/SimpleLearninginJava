package InterfaceDemo;

public class TestInterface {

    public static void main(String[] args) {
        DomesticAnimal animal=new Dog();
        animal.makeSound();
        animal.pet();
        animal.eat();

        Animal.breathe();
    }

}
