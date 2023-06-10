package AbstractionAndInterfacesDemo;

public class Car extends Vehicle implements Drivable {

    @Override
    public String getType(){
        return "Car";
    }

    @Override
    public void drive(){
        System.out.println("Car is being driven.");
    }

}
