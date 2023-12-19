package SetDemo;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {
        Set<String> fruitSet=new HashSet<>();

        //Add elements to the set
        fruitSet.add("Apple");
        fruitSet.add("Banana");
        fruitSet.add("Mango");
        fruitSet.add("Orange");

        // Attempt to add a duplicate element
        boolean isAdded= fruitSet.add("Apple");
        System.out.println("Was 'Apple' added again? " + isAdded);   //Should print false;

        //Print the element of the set
        System.out.println("The set contains: ");
        for(String fruit : fruitSet){
            System.out.println(fruit);
        }


        //Check if a certain element exists

        if (fruitSet.contains("Mango")) {
            System.out.println("The set contains Mango");
        }else{
            System.out.println("The set not having Mango");
        }

        fruitSet.remove("Orange");
        System.out.println("After removing Orange, the set contains: "+fruitSet);

    }
}
