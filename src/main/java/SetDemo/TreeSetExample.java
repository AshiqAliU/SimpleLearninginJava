package SetDemo;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        Set<String> treeSet=new TreeSet<>();

        //Add elements to the set
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Mango");
        treeSet.add("Orange");

        //The elements are sorted
        System.out.println("The sorted set contains ");
        for(String fruit: treeSet){
            System.out.println(fruit);
        }


    }

}
