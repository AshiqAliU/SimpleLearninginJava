package StreamDemo;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {

        ArrayList<String> nameList=new ArrayList<>();
        nameList.add("John");
        nameList.add("Adam");
        nameList.add("Sam");
        nameList.add("Jo");
        nameList.add("Abcdef");
        nameList.add("Sam");

        //Intermiate Operations.

        //Filter, map, sorted, distinct,limit, skip, flatmap
        Stream<String> longString=nameList.stream().filter(s->s.length()>=4);
        longString.forEach(System.out::println);

        System.out.println("**************************************");
        //map

        Stream upperString = nameList.stream().map(String::toUpperCase);
        upperString.forEach(System.out::println);
        System.out.println("**************************************");

        //sorted
        Stream<String> sortedStrings=nameList.stream().sorted();
        sortedStrings.forEach(System.out::println);
        System.out.println("**************************************");

        //Distinct
        Stream<String> distinctString=nameList.stream().distinct();
        distinctString.forEach(System.out::println);
        System.out.println("**************************************");

        //Limit
        Stream<String> limitedString=nameList.stream().limit(3);
        limitedString.forEach(System.out::println);
        System.out.println("**************************************");

        //flatMap

        Stream<String> letters=nameList.stream().flatMap(s-> Arrays.stream(s.split("")));
        letters.forEach(System.out::println);
        System.out.println("**************************************");

        //Terminal Operations
        //Foreach
      //  upperString.forEach(System.out::println);

        List<String> subList= nameList.stream().filter(m->m.contains("abc")).collect(Collectors.toList());

/*        Map<Integer, String> idNametoMap=nameList.stream().collect(Collectors.toMap(2,name));



        Map<Integer, String> idToNameMap = nameList.stream()
                .collect(Collectors.toMap(Person::getId, Person::getName));

        */

        long numOfObj= nameList.stream().count();


        //reduce

        Optional<String> conString= nameList.stream().reduce((a,b)->a+"|"+b);
        System.out.println("cont  " +conString);

        //anyMatch  & allMatch

        boolean hasShortWord=nameList.stream().anyMatch(s->  s.length()<4);

        System.out.println("Has short word :" +hasShortWord);

        boolean allLongWords=nameList.stream().allMatch(s->s.length()>5);
        System.out.println("Has Long Word :" +allLongWords);

        //findAny or findFirst

        Optional<String> anyString=nameList.stream().findAny();
        Optional<String> firstString=nameList.stream().findFirst();


        System.out.println("Any String  :"+ anyString.get());
        System.out.println("First String  :"+ firstString.get());



    }


}
