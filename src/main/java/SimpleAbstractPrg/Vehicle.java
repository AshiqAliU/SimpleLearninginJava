package SimpleAbstractPrg;

public abstract class Vehicle {

    //Abstract Method (does not have a body)
    public abstract void start();

    //Regular Method

    public void stop(){
        System.out.println("The Vehicle stopped");
    }

}
