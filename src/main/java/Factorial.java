public class Factorial {

    public static void main(String[] args) {

        int num=5;
        long factorial=1;
        while(num>0){
            factorial*=num;
            num--;
        }

        System.out.println("Factorial of "+5+" is "+ factorial);

    }

}
