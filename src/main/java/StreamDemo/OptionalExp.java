package StreamDemo;

import java.util.Optional;

public class OptionalExp {
    public static void main(String[] args) {

        Optional<String> name=Optional.of("Hello World");

        if(name.isPresent()){
            System.out.println("Value :" +name.get());
        }

        name.ifPresent(value-> System.out.println("Value using ifPresent :"+value));

        //Handling absense of value;

        String nullValue=null;
        Optional<String> absentValue=Optional.ofNullable(nullValue);

        String result=absentValue.orElse("Default Value");

        System.out.println("Result for absent value: "+result);

        //Using orElseget

        result=absentValue.orElseGet(()->"Value from orElseGet");
        System.out.println("Result from orElseGet :"+result);



    }
}
