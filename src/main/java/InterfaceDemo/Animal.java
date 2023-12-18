package InterfaceDemo;

@FunctionalInterface
public interface Animal {



    void makeSound();

    default void eat(){
        System.out.println("Eating.....");
    }

    static void breathe(){
        System.out.println("Breathing.....");
    }

}
