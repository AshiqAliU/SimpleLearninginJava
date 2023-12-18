import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Alice","Bob","Charlie","Diana");


        //Define a Predicate

        Predicate<String> startA=name->name.startsWith("B");

        List<String> startANameList=names.stream().filter(startA).collect(Collectors.toList());

        startANameList.forEach(System.out::println);

    }
}
