package ListDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String args[]){

        List<String> fruits=new ArrayList<>();

        //Add elements samples
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Cherry");

        String firstFruit= fruits.get(0); // Constant - time positional access.

        fruits.set(1,"BlueBerry");

        fruits.remove(2);

        for(String fruit:fruits){
            System.out.println(fruit);
        }



    }

}
