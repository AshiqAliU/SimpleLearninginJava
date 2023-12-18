package CustomExceptionDemo;

public class Customer {

    private int age;

    public Customer(int age) throws InvalidAgeException{
        setAge(age);
    }

    public void setAge(int age) throws InvalidAgeException {

        if(age<=0 || age >=150){
            throw new InvalidAgeException("Age must be between 0 and 150");
        }
        this.age=age;
    }

    public int getAge(){
        return age;
    }



}
