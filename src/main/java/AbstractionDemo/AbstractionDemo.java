package AbstractionDemo;


abstract class Shape{
    public abstract double calculateArea();
}

class Circle extends Shape{

   private final double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape{

    private final double length;
    private final double width;

    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }

    @Override
    public double calculateArea() {
        return length*width;
    }
}

public class AbstractionDemo {

    public static void main(String[] args) {
        Shape circle=new Circle(5.0);
        Shape rectangle=new Rectangle(4.0,6.0);

        System.out.println("Area of Circle : "+circle.calculateArea());
        System.out.println("Area of Rectangle : "+rectangle.calculateArea());
    }

}
