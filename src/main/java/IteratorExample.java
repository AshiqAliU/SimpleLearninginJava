import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> numbers= new ArrayList<>(Arrays.asList(1,2,3,4,5));

/*
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
*/

        Iterator<Integer> iterator=numbers.iterator();

        while(iterator.hasNext()){
            int number = iterator.next();
            if(number%2!=0){  //if it is odd
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }

}
