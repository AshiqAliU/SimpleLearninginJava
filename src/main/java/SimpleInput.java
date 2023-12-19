import java.util.Scanner;

public class SimpleInput {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("To-Do List Application ");
        System.out.print("Please choose any one options for today ");
        System.out.print("1. Add the task");
        System.out.print("2. Delete the specific task");

        String userInput=scanner.nextLine();

        switch (userInput) {
            case "1":
                System.out.println("Hi Hello How are you");
                break;
            case "2":
                System.out.println("Who are you?");
                break;
        }
        System.out.println("You entered : "+userInput);
        scanner.close();
    }

}
