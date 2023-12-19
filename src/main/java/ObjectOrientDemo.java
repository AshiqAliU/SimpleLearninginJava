public class ObjectOrientDemo {

    private int valueA;
    private int valueB;

    private static int valueC=20;

    ObjectOrientDemo(){}

    ObjectOrientDemo(int valueA,int valueB){
        this.valueA=valueA;
        this.valueB=valueB;
    }


    public static void main(String[] args) {
        valueC=30;

        int x=10;

        ObjectOrientDemo demo=new ObjectOrientDemo();
        ObjectOrientDemo demo1=new ObjectOrientDemo();
        demo.addition(2,2);
        demo.addition(9.0,2.0);

        ObjectOrientDemo orientDemo=new ObjectOrientDemo(12,23);

        System.out.println("A "+ orientDemo.valueA);
        System.out.println("B "+ orientDemo.valueB);

        System.out.println("C "+ ObjectOrientDemo.valueC);
        System.out.println("Sum "+ orientDemo.addition(10,20));



    }

    private int addition(int valueA,int valueB){
        valueC=100;
        return valueA+valueB+valueC;
    }

    private double addition(double valueA,double valueB){
        return valueA+valueB+valueC;
    }

    public static String signatureDone(String name){
        name="Abc "+" xyz";
        return name;
    }

/*
    <Access_Modifier> <static as Optional > <Void or any datatype as return> <NameofMethod>(Parameter as required ){

        return <based of above datatype>
    }
*/

}
