package Assignment01;

public class Vehicle {

    //properties or attributes

    private int speed;
    private String color;


    //behaviour or Method
    public void accelerate(int amount){
        speed+=amount;
    }

    public void decelerate(int amount){
        speed-=amount;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String newColor){
        color=newColor;
    }

    public int getSpeed(){
        return speed;
    }

}
