import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsDemo {

    public static void main(String[] args) {

        //Previous Generic Type Casting -- Explicitly
        List list=new ArrayList();//,Vector List, LinkedList, Stack
        list.add("hello");
        list.add("hello");
        list.add(123);
        list.add(123);
        String s = (String)list.get(0);    //



        List<Integer> list1=new ArrayList<Integer>();
        list1.add(112);
        int name=list1.get(0);

        Box<Integer> integerBox = new Box<>();
        Box<Double>  doubleBox=new Box<>();

        integerBox.setValue(2343);
        doubleBox.setValue(128.99);

        Integer[] array={2,3,4,5};
        integerBox.printArray(array);

        Double[] arrayStr={12.3,11.5,42.5};
        doubleBox.printArray(arrayStr);

        Box<String> stringBox=new Box<>();

        stringBox.setValue("ABCD");

        String[] strAry={"ABCHD","XYZ","CDE","IJK"};

        List<String> nameStr= Arrays.stream(strAry).toList();
        stringBox.printList(nameStr);
        System.out.println("......................................................");
        GenericsDemo.print("ANCH");
        GenericsDemo.print(12345);


        System.out.println("......................................................");

        NumberBox<Integer> intBox=new NumberBox<>(12345);
        NumberBox<Double> douBox=new NumberBox<>(12.34);

       // NumberBox<String> stringNumberBox=new NumberBox<String>("Hi");

        System.out.println("......................................................");

        List<String> strings=Arrays.asList("A","B","C");
        printList(strings);

        List<Integer> integers=Arrays.asList(1,2,3,4);
        printList(integers);

    }

    public static <T> void print (T input){
        System.out.println(input);
    }


    public static void printList(List<?> list){
        for(Object item:list){
            System.out.println(item);
        }
    }



}
