package ArrayListDemo2;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> fruits=new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Fruits :" +fruits);

        System.out.println("Size of ArrayList : " +fruits.size());

        System.out.println("First fruit : "+fruits.get(0));

        fruits.set(1,"Mango");

        System.out.println("Modified Fruits :"+fruits.get(1));

        fruits.remove("Orange");
        System.out.println("Removed Fruits: "+fruits);

        //Check if the Arraylist contains a specific fruits;
         boolean containsApple=fruits.contains("Apple");

        System.out.println("Contains Apple ? : "+containsApple);

        //Clear the ArrayList;

        fruits.clear();
        System.out.println("Cleared Fruits :" + fruits);

        boolean isEmpty=fruits.isEmpty();
        System.out.println("Is the ArrayList  empty? : "+isEmpty);


    }
}
