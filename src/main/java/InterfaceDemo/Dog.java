package InterfaceDemo;

public class Dog implements DomesticAnimal {

    @Override
    public void pet(){
        System.out.println("wags tail");
    }


    @Override
    public void makeSound() {
        System.out.println("Bark Bark");
    }
}
