package AbstractionAndInterfacesDemo;

public class Airplane extends Vehicle implements Flyable {

    @Override
    public String getType(){
        return "Airplane";
    }

    @Override
    public void fly(){
        System.out.println("Airplane is flying.");
    }


}
