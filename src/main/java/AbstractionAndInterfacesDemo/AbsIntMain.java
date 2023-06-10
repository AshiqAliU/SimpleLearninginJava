package AbstractionAndInterfacesDemo;

public class AbsIntMain {

    public static void main(String[] args) {
        Car car=new Car();
        Airplane airplane=new Airplane();

        //Polymorphic behahiour through interfaces

        Drivable drivable=car;
        Flyable flyable=airplane;

        //Calling methods based on Interfaces
        car.startEngine();
        car.drive();

        airplane.startEngine();
        airplane.fly();

        System.out.println("Car type : " +car.getType());
        System.out.println("Airplane type : "+airplane.getType());


    }

}
