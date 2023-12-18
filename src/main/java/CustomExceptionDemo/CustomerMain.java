package CustomExceptionDemo;

public class CustomerMain {

    public static void main(String[] args) {
        try{
            Customer customer=new Customer(0);
            System.out.println("Age of customer :" +customer.getAge());
        }catch (InvalidAgeException e){
            e.printStackTrace();
        }
    }
}
