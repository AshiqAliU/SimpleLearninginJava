package PolymorphismDemo;

public class TestPolymorphism {

    public static void main(String[] args){
        Shape[] shapes=new Shape[3];
        shapes[0]=new Circle(5);
        shapes[1]=new Rectangle(3,4);
        shapes[2]=new Circle(3);

        for(int i=0;i< shapes.length;i++){
            System.out.println("Area of the shape: "+shapes[i].area());
        }



    }
}
