package StreamDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lamdbaExp {

    public static void main(String[] args) {

        List<String> fruits= Arrays.asList("apple","banana","cherry");

        //fruits.forEach( fruit-> System.out.println(fruit));

        fruits.sort((String fruit1,String fruit2) -> fruit1.compareTo(fruit2));

        List<String> longFruits=fruits.stream()
                  .filter(fruit->fruit.length()>5).
                collect(Collectors.toList());

        Runnable task=()-> System.out.println("Running a task");
        new Thread(task).start();

    }

}
