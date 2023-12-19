package MapDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        Map<String, String> map=new HashMap<>();

        map.put("Alice","Texas");
        map.put("Bob","Chicago");
        map.put("Charlie","Minneapolis");

        String cityName=map.get("Alice");
        System.out.println("Alice;s city "+cityName);

        if(map.containsKey("Bob")){
            System.out.println("Bob is in the map");
        }

        if(map.containsValue("Chicago")){
            System.out.println("There is a key with value Chicago in the Map");
        }

        System.out.println("Entries in the map: ");

        for(Map.Entry<String, String> entry:map.entrySet()){
            String key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+" => "+value);

        }

        map.remove("Charlie");
        System.out.println("After removing Charlie, the map contrains: "+ map.entrySet());


    }

}
