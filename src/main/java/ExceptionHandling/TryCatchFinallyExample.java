package ExceptionHandling;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        try {
            int[] number={1,2,3,4,5};
            System.out.println("Accessing element at index 10: "+number[10]);
            System.out.println("Access element at index 1 :"+number[1]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Caught an ArrayIndexOutOfBoundsException: "+e.getMessage());
        }
        finally {
            System.out.println("Inside the finally block.");
        }

        System.out.println("Program continues after the try catch-finally blocks");

        int dividend=10;
        int divisor=0;

        try{
            int result=dividend/divisor;
            System.out.println("Result :" +result);
        }catch (ArithmeticException e){
            System.out.println("Caught an Arithmetic Exception : "+e.getMessage());
        } finally {
            System.out.println("Inside the finally block");
        }

        System.out.println("Program continues after the try catch-finally blocks");


    }

}
