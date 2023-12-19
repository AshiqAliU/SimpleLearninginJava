package SetDemo;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        //Create a LinkedHashSet
        Set<String> linkedHashset=new LinkedHashSet<>();

        //Add elements to the set
        linkedHashset.add("Apple");
        linkedHashset.add("Banana");
        linkedHashset.add("Mango");
        linkedHashset.add("Orange");

        //Attempt to add a duplicate Element
        boolean isAdded=linkedHashset.add("Apple");
        System.out.println("Was  'Apple' added again ? "+isAdded);

        System.out.println("The set contains (in insertion order)");
        for(String fruit:linkedHashset){
            System.out.println(fruit);
        }

        //Check if a certain element exists

        if(linkedHashset.contains("Mango")){
            System.out.println("The set contain Mango");
        }

        //Remove an element
        linkedHashset.remove("Orange");
        System.out.println("After removing Orange, the set contains: "+linkedHashset);



    }

}
