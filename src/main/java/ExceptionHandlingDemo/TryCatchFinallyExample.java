package ExceptionHandlingDemo;

public class TryCatchFinallyExample {

    public static void main(String[] args) {

        try{
            int result=divide(10,2);
            System.out.println("Result : "+result);

            Integer.parseInt("2129a");

        }catch (ArithmeticException e){
            System.out.println("Caught ArimethicException: "+e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("Caught NumberFormat Exception: "+e.getMessage());
        }
        catch(Exception e){
            System.out.println("Caught Exception: "+e.getMessage());
        }
        finally {
            System.out.println("This will always be executed. exception or not ");
        }


    }

    public static int divide(int a, int b){
        return a/b;
    }


}
