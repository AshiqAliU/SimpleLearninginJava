package ListDemo;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] main){

        //Create a Vector of Strings

        Vector<String> colors=new Vector<>();

        //Add Elements

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        //Access Elemenet

        String firstColor=colors.get(0);

        //Modify Elements
        colors.set(1,"Yellow");

        //Remove Elements
        colors.remove(2);

        //Add element at a specific index
        colors.add(1,"purple");


        for(String color:colors){
            System.out.println(color);
        }



    }


}
