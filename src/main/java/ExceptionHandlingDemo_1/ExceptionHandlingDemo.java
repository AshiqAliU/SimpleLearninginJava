package ExceptionHandlingDemo_1;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        try{
            int[] numbers={1,2,3};
            int result=numbers[4];
            System.out.println("Result :"+result);
        }catch(ArrayIndexOutOfBoundsException e ){
            System.out.println("An Error occured : "+e.getMessage());
        }finally {
            System.out.println("Inside the finally block");
        }

    }

}
