import java.util.ArrayList;

public class ControlDemo {

    public static void main(String[] args) {

       /* int[] number= new int[5];

        int[] number1={1,2,3,4,5};

        number[0]=10;

        int x=number[0];

        System.out.println("x value :" +x);*/


        ArrayList<String> stringArrayList=new ArrayList<>();

        ArrayList<Integer> integersArrayList=new ArrayList<>();

        stringArrayList.add("ABC");
        stringArrayList.add("XYZ");

        String name=stringArrayList.get(0);

        for(int i=0; i<stringArrayList.size();i++){
            System.out.println("Before Name "+stringArrayList.get(i));
        }


        stringArrayList.set(1,"TUV");

        for(int i=0; i<stringArrayList.size();i++){
            System.out.println("After Name "+stringArrayList.get(i));
        }

        /// Manage a Dept  Store Employee List


    }

}
