package MapDemo;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        Map<String,Integer> linkedHashMap=new LinkedHashMap<>();

        linkedHashMap.put("Apple",40);
        linkedHashMap.put("Banana",10);
        linkedHashMap.put("Cherry",20);
        linkedHashMap.put("Date",30);

        System.out.println("LinkedHashMap (after insertion): "+linkedHashMap);

        linkedHashMap.get("Cherry");


        linkedHashMap.put("Apple",40);
        System.out.println("LinkedHashMap (after access and re-insertion) : " +linkedHashMap );


        System.out.println("Entries in the map:");

        for(Map.Entry<String, Integer> entry: linkedHashMap.entrySet()){
            String key=entry.getKey();
            Integer value=entry.getValue();
            System.out.println(key+" ==> "+value);
        }

        linkedHashMap.remove("Date");
        System.out.println("After removing Date the map contains: "+linkedHashMap.keySet());









    }

}
