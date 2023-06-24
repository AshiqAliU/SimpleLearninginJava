package CustomException;

public class StudentMain {

    public static void checkAge(int age) throws StudentAgeException {
        if(age<5 || age>20){
            throw new StudentAgeException("Age must be btn 5 and 20 for the school student");
        }else{
            System.out.println("The Student age is acceptable");
        }
    }

    public static void main(String[] args) {
        try{
            checkAge(21);
        }catch (StudentAgeException e){
            System.out.println("Caught the Exception.");
            System.out.println(e.getMessage());
        }


    }

}
