import java.util.ArrayList;

public class ArrayandArrayListDemo {

    public static void main(String[] args) {

       //Demo of Array
        int[] numbers=new int[10];

        // Add Values to the array
        for(int i=0; i<numbers.length;i++){
            numbers[i]=i*5;
        }

        //print array values;
        for(int i=0; i< numbers.length; i++){
            System.out.println("ArrayValue at Index "+i+ " : "+numbers[i]);
        }

        //ArrayLists Demo

        ArrayList<String> name=new ArrayList<String>();

        name.add("ABC");
        name.add("DEF");
        name.add("XYZ");
        name.add("XYZasr");

        for(int i=0; i<name.size(); i++){
            System.out.println("ArrayList Value at Index "+i+ " : "+name.get(i));
        }


    }

}
