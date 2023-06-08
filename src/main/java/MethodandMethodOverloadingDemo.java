package java;

public class MethodandMethodOverloadingDemo {

    public static void main(String[] args) {
        System.out.println(add(10,18));
        System.out.println(add(10.30,14.30));
        System.out.println(add(10.30,14.30,20.42));
        System.out.println(add("Hello", " World"));
        System.out.println(add("100", " 200"));
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static double add(double a, double b){
        return a+b;
    }

    public static double add(double a, double b,double c){
        return a+b+c;
    }

    public static String add(String a, String b){
        return a+b;
    }

}
