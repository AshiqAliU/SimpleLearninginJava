package DemoInCollections;

import java.util.*;

public class Main_Collection {

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        list.add("Mango");
        list.add("Grapes");
        list.add("Banana");
        list.add("Apple");
        list.add("Orange");
        list.add("Apple");
        list.add("Banana");

        System.out.println("Before sorting : "+list);
        Collections.sort(list);
        System.out.println("After sorting : "+list);

        Set<String> fruits=new HashSet<>();
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Banana");

        System.out.println("Set does not allow duplicate values :"+fruits);

        Map<String, Integer> fruitsMap=new HashMap<>();
        fruitsMap.put("Apple",30);
        fruitsMap.put("Banana",20);
        fruitsMap.put("Apple",10);
        System.out.println("Map -- HashMap :"+fruitsMap);

        System.out.println("Banana :"+fruitsMap.get("Banana"));

        Iterator<String> stringIterator=list.iterator();
        while(stringIterator.hasNext()){
            String fruitName=stringIterator.next();
            System.out.println(fruitName);
        }

    }

}
