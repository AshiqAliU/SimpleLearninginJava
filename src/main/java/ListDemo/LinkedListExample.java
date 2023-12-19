package ListDemo;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {
        List<String> animals=new LinkedList<>();

        //Add  elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");

        //Access Elements
        String firstAnimals=animals.get(0);

        //modify elements;
        animals.set(1,"Bird");

        //remove element
        animals.remove(2);

        //Add to the beginning;

        ((LinkedList<String>)animals).addFirst("Lion");

        //Iterate
        for(String animal:animals){
            System.out.println(animal);
        }






    }
}
