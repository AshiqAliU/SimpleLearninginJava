package Assignment01;

public class VehicleMain {
    public static void main(String[] args) {

        //ClassName objNames= instances of the Vehicle class ;
        Vehicle vehicle=new Vehicle();

        vehicle.setColor("red");
        vehicle.accelerate(20);

        System.out.println("Current speed :" + vehicle.getSpeed());
        System.out.println("Currect color :" + vehicle.getColor());

        vehicle.decelerate(15);
        System.out.println("Currect reduce speed :" + vehicle.getSpeed());
    }
}
